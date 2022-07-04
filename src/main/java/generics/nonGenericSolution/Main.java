package generics.nonGenericSolution;


//      1.Stworzyć	klasę	TrekkingShoes zawierającą	pola – waterproofLevel typu	int,	flexibility
//        typu int oraz	weight typu	double.	Stwórz	także	klasę	Trekker zawierającą	pole	– shoes
//        typu	TrekkingShoes.
//      2.Stworzyć	klasę	RunningShoes zawierającą	pola	– amortizationLevel typu	int,	flexibility
//        typu int oraz	weight typu	double.	Stwórz	także	klasę	Runner zawierającą	pole	– shoes
//        typu	RunningShoes.
//      3.Stworzyć	klasę	Hills zawierającą	pola	–dimention	typu int oraz	weight typu	double.
//        Stwórz	także	klasę	Model zawierającą	pole	– shoes typu	Hills.
//      4.W	metodzie	main,	stworzyć	obiekty	typu	Trekker, Runner	oraz Model.	Wyświetlić
//        wagi	poszczególnych	butów
//      5.Przerobić	zaimplementowane	rozwiązanie	z	wykorzystaniem	generycznej	klasy
//        Person oraz	klasy	Shoes.	Klasy	Trekker,	Runner oraz	Model nie	powinny	być	już
//        potrzebne	na	zakończenie	tego	punktu.
//      6.Stworzyć	klasę	SportShoes po	której	dziedziczą	TrekkingShoes	oraz RunningShoes
//        oraz klasę	Athlete	dziedziczącą	po	Person.
//      7.Dodaj klasę	FitFabric wraz	ze	statyczną	metodą	exercise przyjmującą	sportowca
//        (Athlete)	jako	parametr,	wewnątrz	metody	wypisz	elastyczność	butów	w	których
//        przyszedł	na	siłownie	:D
//      8.Dodaj	klasę	Clothes,	która	będzie	2	parametrem	generycznym	klasy	Athlete.	Klasa
//        clothes będzie	posiadać	pola	maxDegree oraz	minDegree oba	typu	int.
//      9.Stwórz	powownie	klasę	Trekker dziedziczącą po	Athlete. Dodaj	warunek	w
//        konstruktorze	klasy	Trekker,	który	sprawdza	czy	minDegree	jest	mniejsze	bądź	równe
//        -10,	jeżeli	nie	to	rzuć	wyjątkiem	IllegalArgumentException z	odpowiednią wiadomością

import generics.genericSolution.FitFabric;

public class Main {
    public static void main(String[] args) {

        RunningShoes runningShoes = new RunningShoes(8, 8, 1.2);
        TrekkingShoes trekkingShoes = new TrekkingShoes(9, 5, 2.3);
        Hills hills = new Hills(4, 2.0);

        Model model = new Model(hills);
        Trekker trekker = new Trekker(trekkingShoes);
        Runner runner = new Runner(runningShoes);

        System.out.println(model.getShoes().getWeight());
        System.out.println(runner.getShoes().getWeight());
        System.out.println(trekker.getShoes().getWeight());

    }
}
