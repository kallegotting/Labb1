package Labb1GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Uppgift7 extends Application {
    ArrayList<Gud> godList = new ArrayList<>();
    public static void main(String[] args) {
        launch(args);



    }

    @Override
    public void start(Stage primaryStage) {


        Gud tor = new Gud("Tor","Asagud","Till ursprunget och funktionen är Tor besläktad med den fornindiske guden Indra. I stort sett till funktionen, men inte till ursprunget påminner Tor också om den grekiske guden Zeus och den romerske Jupiter.[1] Namnet Tor används ännu idag i sammansättningen tordön vilket är synonymt med åska. Det är vidare etymologiskt besläktat med lånordet dunder (av lågtyskt dunder) liksom engelskans thunder, tyskans Donner och så vidare.");
        Gud oden = new Gud("Oden","asagud","Oden eller Odin, på fornnordiska Óðinn, på fornengelska Wōden, fornsaxiska UUôden,[1], på fornhögtyska Uuodan, från urgermanskans rekonstruerade Wōdanaz, är den äldste, störste och visaste av asagudarna i den nordiska mytologin. Han är också krigsgud, skaldekonstens gud och de dödas gud, och är den främste utövaren av sejdkonsten. Namnet Oden har samma etymologiska grund som Od, Frejas försvunne make. Oden hade också flera andra namn, såsom Gangleri (Den färdtrötte), se vidare lista över namn på Oden. ");
        Gud balder = new Gud("Balder","asagud","Balder (fornnorska/fornisländska Baldr, isländska Baldur), vilket betyder \"den lysande\" eller \"herren\", är en gud i nordisk mytologi. Son till Oden och Frigg, make till Nanna och far till Forsete (Forseti). Balder bodde i Bredablick.");
        Gud loke = new Gud("loke","asagud","Loke (fornnordiska Loki, svenska dialekter & danska dialekter Locke) är en av asagudarna i nordisk mytologi, trots att han var son till en jätte. I den äldre Poetiska Eddan förekommer Loke i flera av dikterna och är en central figur i några av dem. Namnet Loke har ännu, trots många försök, inte tolkats etymologiskt övertygande.");


        Gud hel = new Gud("hel","asagud","Hel (ungefär den som gömmer, fördolt, gömd) är dotter till Loke och Angerboda i nordisk mytologi och härskarinna över ett dödsrike, kallat Helheim eller bara Hel, beläget i Nifelheim, som av somliga anses som ett slags motsats till Valhall. I källorna till den fornnordiska religionen påstås det att alla som inte dör på slagfältet skulle hamna i Hel, medan de bästa kämparna kommer till Valhall och Folkvang. Men det sägs också att endast brottslingar kommer till Hel.\n" +
                "\n" +
                "Motsägelserna bottnar i förhållandet att Hel ursprungligen var ett förkristet dödsrike för alla människor. Namnet går tillbaka på forngermanska helan \"dölja, gömma\" och syftar på en stor gästabudssal där alla döda rymdes.\n" +
                "\n" +
                "Hel var beläget i norr, dödens väderstreck, och vägen dit bär nedåt. Medeltida beskrivningar av dödsriket är färgade av kristna uppfattningar om dödsriket som en straffort. Här kallas bordet \"Hunger\", kniven \"Svält\", sängen \"Sjukläger\",sängöverkastet \"Glänsande ofärd\" och tröskeln \"Fallande fördärv\". Det finns också trälar som uppassare, men deras tjänstvillighet speglas i namnen \"Gånglate\" och \"Gånglata\".\n" +
                "\n" +
                "Dödsrikets härskarinna Hel är en sen konstruktion i den fornnordiska poesin, där hon sägs vara Lokes dotter. Döden kan här omskrivas till ett kärleksmöte med henne, men i andra (kristna) källor framställs hon som svartblå och likblek.");


        Gud ran = new Gud("Ran","Jätte","Ran (på isländska Rán, vilket betyder \"rån\") är i nordisk mytologi havsdjupets gudinna och maka till jätten Ägir.\n" +
                "\n" +
                "Ran fångar in drunknade personer med sitt stora nät och håller dem i sina salar på havets botten. Ran lånade ut sitt nät till Loke som använde det till att fånga dvärgen Andvare. Talesättet \"klättra ner i Rans säng\" är en kenning för att drunkna.[1] Ran kallas i bland annat Fritiofs Saga också för Rana.[2] I senare folktro kallades hon för Havsfrun och sägner om henne levde kvar in på 1900-talet.");


        Gud aegir = new Gud("Ägir","Jätte","\n" +
                "Ägir och Ran av F. W. Heine\n" +
                "\n" +
                "Ägir och Ran med sina nio döttrar. Illustration av Jenny Nyström ur Fredrik Sandlers utgåva av Eddan, 1893.\n" +
                "Ägir (även Lä eller Le[1]), fornvästnordiska Ægir, fornsvenska möjligtvis *Æghir,[2] är i nordisk mytologi en jätte som härskar över havet. Namnet Ägir betyder hav[3]. Han är son till jätten Fornjot, bror till Låge (elden) och Kåre (vinden) och morfar till Heimdall");

        Gud freja = new Gud("Freja","Asagud","Freja eller Fröja[1] (isländska/fornnordiska Freyja, Svenska dialekter Fröa, färöiska Froya) är en fruktbarhetsgudinna i nordisk mytologi. Hon är valkyriornas ledare samt vanernas viktigaste gudinna och har därför även namnet Vanadis. Hon är dotter till Njord (med språklig anknytning till fem. Nerthus), och syster till Frej (även kallad Frö).\n" +
                "\n" +
                "Hon kallas även \"Valfreja\" av Snorre, alltså \"de stupades Freja\" eller \"de stupades fru\".\n" +
                "\n" +
                "Orden Frej och Freja har betydelsen \"Herren\" (härskaren) och \"Frun\" (härskarinnan) och är ett syskonpar, inte ett gudapar såsom Frigga-Oden eller Gerd–Frej. Det har varit svårt att skilja mellan Freja och Frigg (se nedan) och dessutom har vissa forskare, exempelvis Hilda Ellis Davidson och Britt-Mari Näsström uppmärksammat att andra gestalter i den nordiska mytologin, såsom Gefjon, Gerd och Skade, skulle kunna vara Freja i andra roller.[2] Fröja äktar i Fjolsvinnsmål en inre aspekt av Oden kallad Svipdag vilken kommer till Valhall med segersvärdet vilket senare skänks till Frej. Att Freja—Oden var ett gudapar som firades vid vintersolståndet, det vill säga jul, är möjligt men inte belagt");


        godList.add(tor);
        godList.add(oden);
        godList.add(balder);
        godList.add(loke);
        godList.add(hel);
        godList.add(ran);
        godList.add(aegir);
        godList.add(freja);

        BorderPane layout = new BorderPane();


        javafx.scene.control.ListView<String> gudList;
        gudList = new ListView<>();
        gudList.setPrefWidth(150);




        gudList.getItems().addAll(
                "tor",
                "oden",
                "loke",
                "balder",
                "hel",
                "ran",
                "aegir",
                "freja"
        );



        TextFlow beskrivning = new TextFlow();
        beskrivning.setPadding(new Insets(5));
        ScrollPane scroll = new ScrollPane();
        scroll.setFitToWidth(true);
        scroll.setContent(beskrivning);
        scroll.setPrefSize(200,200);


        gudList.getSelectionModel().selectedIndexProperty().addListener(ov ->{
            int gudNummer = gudList.getSelectionModel().getSelectedIndex();
            Gud klickadgud = godList.get(gudNummer);
            Text text = new Text(klickadgud.getBeskrivning());
            text.setSelectionEnd(10);
            beskrivning.getChildren().clear();
            beskrivning.getChildren().addAll(text);
        });


        layout.setLeft(gudList);
        layout.setCenter(scroll);
        Scene scene = new Scene(layout,600,400);

        primaryStage.setTitle("Asatron");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}


