import java.util.InvalidPropertiesFormatException;

public class Main {
    public static void main(String[] args) throws NotCorrectUser, InvalidPropertiesFormatException {

//        Task1
//Bir Exception class ı yazın, həmin Exception class-ının adı NotCorrectUser olsun.
// Bir metod yazin User obyekti qebul etsin. Metod daxil edilən User-in yaşının 65-dən yuxarı
//olub-olmamasını yoxlasın. Əgər 65-dən kiçikdirsə, yaratdığımız exception-u atın və
//mesaj hissəsində “istifadəçi uyğun deyil !” yazısı mesaj kimi ötürülsün.

//        User user1=new User(1,56,"leyla1");
//        User user2=new User(1,56,"leyla2");
//        User user3 =new User(1,56,"leyla3");
//    check(user1);
//    }
//    public static void check(User user) throws NotCorrectUser {
//            if(user.getAge()>65){
//                System.out.println("sisteme daxil oldunuz");
//            }
//        throw new NotCorrectUser("istifadəçi uyğun deyil !");



//Exceptions simple tasks
        SimpleTasks simpleTasks=new SimpleTasks("Error");

//1.0-a boldukde unchecked exception atan proqram yazin.
                //simpleTasks.divide();

//2.NegativeNumber adli oz exception classinizi yaradin ve metoda menfi deyer oturuldukde bu exceptionu
//xeta kimi atsin.
        //simpleTasks.negativeNumber();

//3.Stringi int-e cevirdikde atilacaq NumberFormatException i handle edin.
        //simpleTasks.NumberFormat();

//4.Dəyər 10-dan böyük olduqda və sıfıra bölündükdə ArithmeticException atan metod yaradın.
        //simpleTasks.Arithmetic();

//5.Massivin hüdudlarından kənarda massiv elementinə daxil olmaq istəyərkən ArrayIndexOutOfBoundsException-u
//tutan proqram yazın.
       // simpleTasks.ArrayIndex();

//6.InvalidFormatException adli custom exception yaradin eger istifadecinin yasi 18-den kicik olarsa
//bu xetani atsin
      //  simpleTasks.CustomEx();

//7.Null obyekti ile isleyerken NullPointerException i handle eden proqram yazin
        //simpleTasks.NullPointer();

//8.Massivdə olmayan elementə daxil olmağa çalışarkən NoSuchElementException-ı tutan proqram yazın.
       // simpleTasks.NoElement();

//9.eger scannerden daxil edilen deyer menfi olarsa InvalidInputException adli custom bir exception atsin
        //simpleTasks.NegativeInput();

//10.Daxil edilen String deyerini int-e cevirme prosesinde eger String deyerin formati uygun olmazsa
//yaranan exceptionu tuttan proqram yazin.
      //  simpleTasks.StringNumber();
    }
}