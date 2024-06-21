import java.util.InvalidPropertiesFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SimpleTasks extends Exception {
    public SimpleTasks(String message) {
        super(message);
    }
    Scanner scanner = new Scanner(System.in);

    //1
//    public void divide() {
//        int a = 6;
//        try {
//            int c = a / 0;
//        } catch (Exception e) {
//            throw new RuntimeException(e + " 0-a bolmek olmur");
//        }
//    }

    //2
//    public void negativeNumber(){
//        int num = scanner.nextInt();
//     //   System.out.println(num);
//        if (num > 0) {
//            System.out.println(num);
//        }else{
//            try {
//               if(num < 0)
//                   System.out.println(num);
//            }
//            finally {
//                throw new RuntimeException("Menfi deyer qebul edilmir!");
//            }
//        }
//    }

    //3
//    public void NumberFormat(){
//        String str = "17bb";
//        try{
//            int b = Integer.parseInt(str);
//            System.out.println(b + " Ugurla Integer tipe cevrildi!");
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e + " Integer tipe cevrile bilmedi!");
//        }
//    }

    //4
//    public void Arithmetic() {
//        System.out.println("Eded: ");
//        int number = scanner.nextInt();
//        System.out.println("Bolen: ");
//        int bolen = scanner.nextInt();
//        if (number > 10 && bolen == 0) {
//            try {
//                int result = number / bolen;
//                System.out.println(result);
//            } catch (ArithmeticException e) {
//               throw new ArithmeticException(" Eded 0-a bolune bilmez!");
//            }
//        } else {
//            System.out.println(number / bolen);
//        }
//    }

    //5
//    public void ArrayIndex(){
//        String arr="hello";
//        try{
//            System.out.println(arr.charAt(6));
//        }catch (IndexOutOfBoundsException e){
//            throw new IndexOutOfBoundsException (e.getMessage() + " ERROR");
//        }
//    }
//    }

    //6
//    public void CustomEx() throws InvalidPropertiesFormatException {
//        System.out.println("Enter your age: ");
//        int userAge = scanner.nextInt();
//            if(userAge >= 18){
//                System.out.println("You can use this material.");
//            }else {
//                try {
//                    if (userAge < 18) {
//                        System.out.println("You can not use this material.");
//                    }
//                } finally{
//                    throw new InvalidPropertiesFormatException("Errorr");
//                }
//            }
//    }

    //7
//    public void NullPointer(){
//        String arr=null;
//        try{
//            System.out.println(arr.length());
//        }catch (NullPointerException e){
//            throw new NullPointerException("Array is null!");
//        }
//    }

    //8
//    public void NoElement() throws NoSuchElementException {
//        int[] arr={1,2,3,4,5};
//        System.out.println("Which index do you want enter: ");
//        int index = scanner.nextInt();
//        if(index >= arr.length || index < 0){
//            throw new NoSuchElementException("No element: ");
//        }else{
//            System.out.println(arr[index]);
//        }
//    }

    //9
//    public void NegativeInput() {
//        System.out.println("User's age: ");
//        int user1= scanner.nextInt();
//        try{
//            if(user1<0){
//                throw new RuntimeException(getMessage());
//            }
//            System.out.println(user1);
//        }catch (RuntimeException e){
//            throw new RuntimeException("Custom exception");
//        }
//    }

    //10
//        public void StringNumber(){
//        String str = scanner.nextLine();
//        try{
//            int b = Integer.parseInt(str);
//            System.out.println(b + " Successful!");
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e + " Invalid format!");
//        }
//    }

}