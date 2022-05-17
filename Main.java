import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    try {
      Service1 s = new Service1();
      Scanner odczyt=new Scanner(System.in);  
      int wybor=0;
      while(wybor!=3){
      System.out.println("---MENU---");
      System.out.println("1-dopisz studenta");
      System.out.println("2-lista studentów");
      System.out.println("3-wyjście z programu");
      wybor=odczyt.nextInt();
      switch(wybor){
        case 1:{
            System.out.println("podaj imie: ");
            String imie=odczyt.next();  
            System.out.println("podaj wiek: ");
            int wiek=odczyt.nextInt();
            s.addStudent(new Student(imie, wiek));
            System.out.println("Dodano studenta, powrot do menu");
            break;
          }
      case 2:{
        var studenci = s.getStudents();
        for(Student aktualny : studenci) {
          System.out.println(aktualny.ToString());
          }
        }  
      }
      
    }
    odczyt.close();
    } 
    catch (IOException e) {

    }
    }
}