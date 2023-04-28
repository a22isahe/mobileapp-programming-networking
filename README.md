
# Rapport Networking

Först sattes en RecyclerView in i activity_main.xml, constraints och id sattes.
Layouten länkades även till Ett RecyclerVIew objekt I MainActivity.
En Adapter-klass skapades och fick namnet RecyclerViewAdapter. Denna ärver färdigskrivna metoder från RecyclerView.Adapter och har till uppgift
att rita ut, hålla koll på antalet, och hantera det som ska visas upp i En RecyclerView.
tre objekt deklarerades: en arrayList för att hålla i Mountain objekt, en LayoutInflater för att rita ut objekten på skärmen och en 
onclickListener.
EN konstruktor autogenererades och ett antal metoder  Overridades/ärvdes. Där främmande objekt och referenser till layout och id fanns sattes egna objekt 
och referenser in.
I MainActivity Deklarerades och initierades en ArrayList<Mountain> och en RecyclerViewAdapter deklarerades.


En Mountain Klass skapades och fick attributet namn (flera attribut skapades vid det här laget men enligt uppgiftsbeskrivningen
krävdes bara namn och de andra attributen togs bort). En getter och setter Genererades samt en konstruktor.



I MainAcitvity ändrades Strängen JSON_URL till en angiven url från Canvas: https://mobprog.webug.se/json-api?login=brom
en ny JsonTask skapades och Exekvereade JSON_URl.
```
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new JsonFile(this, this).execute(JSON_FILE);
       new JsonTask(this).execute(JSON_URL);               Här Exekveras JSON_URL

         adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(Mountain item) {
                Toast.makeText(MainActivity.this, item.getName(), Toast.LENGTH_SHORT).show();
                Log.d("Skriv", "Adapter");
            }
        });


        RecyclerView view = findViewById(R.id.recycler);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);


    }
    
    
```
Därefter Initerades i metoden onPostExecute() en instans av verktyget Gson, som kan hämta Json filer från en webbplats.
EN instans av Type initerades och sattes till typen av ArrayList<Mountain> med hjälp av den inbyggda metoden getType();
med gson Hämtades JsonFilen och värdet användes till items-ArrayListan.
En ny metod skapades i RecyclerViewAdapter som tar emot en ArrayList med syfte att uppdatera sin egna ArrayList.
Metoden kallades I onPostExecute på det här sättet: (adapter.NewItems(ArrayList<Mountain>));


```
@Override
public void onPostExecute(String json) {
//Log.d("MainActivity", json);
Gson gson = new Gson();
Type type = new TypeToken<ArrayList<Mountain>>() {}.getType();
items = gson.fromJson(json,type);
adapter.newItems(items);
Log.d("Skriv", items.toString());
adapter.notifyDataSetChanged();

    }
```



Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:


- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
