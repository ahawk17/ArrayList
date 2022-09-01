import java.util.ArrayList; //Import the ArrayList class
import java.util.Collections; //Import the collections class for the sort method

    public class WSchools{
        public static void main(String[] args){
            //Create an ArrayList object
            ArrayList<String> cars = new ArrayList<String>();

            cars.add("Volvo"); //add elements to arrayList
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            Collections.sort(cars);

            for(String i : cars){ //For-Each loop, String i defines variable i as a string holder
                System.out.println(i); //print arrayList
            }


            //Creating an arrayList that stores numbers instead of strings
            ArrayList<Integer> myNumbers = new ArrayList<Integer>(); //capitalize integer, undefined size
            myNumbers.add(33);
            myNumbers.add(15);
            myNumbers.add(20);
            myNumbers.add(1);

            System.out.println(myNumbers);

            Collections.sort(myNumbers);

            for(int j : myNumbers){
                System.out.println(j);
            }

        }
    }
