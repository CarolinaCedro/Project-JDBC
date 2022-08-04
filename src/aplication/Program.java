package aplication;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "carol");
        System.out.println(obj);

        Seller seller = new Seller(21,"Lena","lena@gmail.com",new Date(),300.00,obj);
        System.out.println(seller);
    }
}
