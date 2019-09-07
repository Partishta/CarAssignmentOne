package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {
        int num;
        ArrayList<Customer> list = new ArrayList<Customer>();
        // ArrayList<Car> list1 = new ArrayList<Car>();

        int[] randam;

        Scanner obj = new Scanner(System.in);

        do {

            System.out.println("Select  1 :for Add New Customer  2 : for Add Car details To existing Customer "
                    + "3 :Show all Customer Deatils sorted By Name  4:"
                    + "  Search indiviual ById 5: Random Number 0: for Exit ");
            num = obj.nextInt();
            switch (num) {
                case 1:
                    // call customer class and add value

                    list.add(new Customer());
                    break;

                case 2:
                    // call Car class and add value
                    int counter=0;
                    int carId;
                    String carModel;
                    double carPrice;


                    Scanner obj1=new Scanner(System.in);
                    Scanner obj2=new Scanner(System.in);

                    System.out.println("Enter Id Of Customer:");
                    int x=obj1.nextInt();


                    for(int i=0;i<list.size();i++)
                    {
                        if (list.get(i).getId() == x)
                        {   counter++;

                            Customer customer=list.get(i);
                            ArrayList<Car> listOfCars=  customer.getCarList();
                            Car car=null;

                            System.out.println("Enter CarType( press Toyota: 1, Maruti: 2,hyundai: 3 )");
                            int carType=obj1.nextInt();
                            switch (carType)
                            {
                                case 1:
                                    System.out.println("Enter car Id,car model and car Price");
                                    carId=obj1.nextInt();
                                    carModel=obj2.next();
                                    carPrice=obj1.nextDouble();
                                    car=new Maruti(carId,carModel,carPrice);
                                    listOfCars.add(car);
                                    customer.setCarList(listOfCars);
                                    break;
                                case 2: System.out.println("Enter car Id,car model and car Price");
                                    carId=obj1.nextInt();
                                    carModel=obj2.next();
                                    carPrice=obj1.nextDouble();
                                    car=new Hyundai(carId,carModel,carPrice);

                                    listOfCars.add(car);
                                    customer.setCarList(listOfCars);
                                    break;
                                case 3:
                                    System.out.println("Enter car Id,car model and car Price");
                                    carId=obj1.nextInt();
                                    carModel=obj2.next();
                                    carPrice=obj1.nextDouble();
                                    car=new Toyota(carId,carModel,carPrice);

                                    listOfCars.add(car);
                                    customer.setCarList(listOfCars);
                                    break;
                                default:
                                    System.out.println("Car Type Does not Exist");
                                    break;

                            }

                        }
                    }


                    if(counter==0)
                    {
                        System.out.println("Id is Not Exist Need To Add New Customer."); }
                    break;


                case 3:

                    // show the all Customer sorted by name

                    Collections.sort(list);
                    for (int i = 0; i < list.size(); i++)
                    {
                        System.out.println("Customer Id : " + list.get(i).getId() + " Name : "
                                + list.get(i).getName() );
                        for(Car carDetail : list.get(i).getCarList())
                        {
                            System.out.println("Car Id: "+carDetail.getCarId() +" Car Model : "+carDetail.getCarModel()+" Car Price: "+carDetail.getCarPrice()+
                                    " Resales Price :"+carDetail.getResalePrice());
                        }
                    } break;
                case 4:
                    // Search the Customer By Id

                    SearchById search = new SearchById();
                    int count=0;
                    for (int i = 0; i < list.size(); i++)
                    {
                        int x1 = search.getCusId();
                        if (list.get(i).getId() == x1)
                        {   count++;
                            System.out.println("Name of Customer: "
                                    + list.get(i).getName());
                            for(Car carDetail : list.get(i).getCarList())
                            {
                                System.out.println("Car Name  "+carDetail.getCarModel());
                            }
                        }
                    }
                    if(count==0)System.out.println("Customer Id is incorrect");

                    break;



                case 5:
                    // here user Randon to distubute prize
                    int flag=0;
                    Random random = new Random();
                    RandomNumber r = new RandomNumber();
                    randam = new int[6];
                    for (int i = 0; i < 6; i++)
                    {
                        int index = random.nextInt(list.size());
                        randam[i] = list.get(index).getId();
                    }
                    for (int i = 0; i < 6; i++)
                    {

                        if (randam[i] == r.num1) {
                            flag++;
                            System.out.println("Id : " + randam[i] + " price Winner");
                            break;
                        }
                        else if (randam[i] == r.num2) {
                            flag++;
                            System.out.println("Id : " + randam[i] + " price Winner");
                            break;
                        }
                        else  if (randam[i] == r.num3) {
                            flag++;
                            System.out.println("Id : " + randam[i] + " price Winner");
                            break;
                        }
                    } if(flag==0)System.out.println("Better Luck For next time :)");
                    break;
            }

        } while (num != 0);
    }

}
// Car Class is as abstract class for different type of car


// class is created for search the customer By id

class SearchById {

    public int cusId;

    public SearchById() {
        System.out.println("Enter Id Of Customer");
        Scanner obj = new Scanner(System.in);
        cusId = obj.nextInt();
    }

    public int getCusId() {
        return cusId;
    }

}


// this class created for distribute prize
class RandomNumber {

    public int num1;
    public int num2;
    public int num3;

    public RandomNumber() {
        System.out.println("Enter 3 random No as id:");
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

}

// Hyundai class is created


// Maruti class is created

// toyota class is created


