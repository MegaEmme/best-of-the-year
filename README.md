# Esercizio - Best of the Year

## *Step 1*
Creare un nuovo progetto Spring Boot MVC + Thymeleaf (puoi trovare il processo sia nella lezione che nelle slide). Il nome del progetto è best-of-the-year (stesso nome della repository).

Nel progetto aggiungere un controller che risponde alla root dell’applicazione, con un metodo che restituisce una view fatta con Thymeleaf in cui viene stampato un titolo: “Best of the year by …” (al posto dei puntini deve apparire il vostro nome, passato come attributo dal controller attraverso il Model).
## *Step 2*
Creare all’interno del controller due metodi privati :
uno restituisce una lista di oggetti di tipo Movie - getBestMovies()
l’altro restituisce una lista di oggetti di tipo Song - getBestSongs()

Creare le classi Movie e Song aventi almeno :
- un id
- un titolo

Aggiungere al controller altri due metodi, che rispondono agli url
“/movies”
“/songs”

In ognuno di questi metodi aggiungere al Model un attributo stringa con una lista di titoli di migliori film o canzoni (in base al metodo che stiamo implementando) separati da virgole. Utilizzare i due metodi getBest… per recuperare i film e le canzoni.

Creare i rispettivi template Thymeleaf.

## *Step 3*
Creare due metodi
“/movies/{id}”
“/songs/{id}” che dato il parametro id passato tramite il path, mostri in pagina il titolo relativo al film / canzone.

Testare chiamando dal browser i diversi url.
## *Step 4*
Includere Bootstrap e fare il refactoring del layout come da allegato, cercando di creare componenti riutilizzabili con i fragments.

Modificare i metodi che rispondono agli url
“/movies”
“/songs”
In modo che entrambi i Model restituiscano una lista di oggetti (Movie o Song) invece di una stringa. 

Modificare anche le rispettive view.
## *Step 5 : Bonus*
Ogni elemento mostrato nella lista (film o canzone) deve essere un link che punta alla rispettiva pagina di dettaglio (e anche in questo caso restituire il Model al posto della stringa col titolo).

Nella pagina home (quella che risponde alla root dell’applicazione) aggiungere due link che portano agli url /movies e /songs.

Nelle pagine con le liste aggiungere un link che riporta alla home page.

Testare navigando l’applicazione.
## Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.4/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.4/maven-plugin/build-image.html)
* [Thymeleaf](https://docs.spring.io/spring-boot/3.5.4/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.4/reference/web/servlet.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.4/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

