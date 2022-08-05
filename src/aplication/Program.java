package aplication;

import model.DAO.DaoFactory;
import model.DAO.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(1);
        System.out.println(seller);


        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller rs : list
        ) {
            System.out.println(rs);
        }

        System.out.println("\n=== TEST 3: seller findAll ===");
        List<Seller> lista = sellerDao.findAll();

        for (Seller rs : lista
        ) {
            System.out.println(rs);
        }

        System.out.println("\n=== TEST 4: seller insert ===");
        Seller seller1 = new Seller(null, "marta", "marta@gmail.com", new Date(), 400.00, department);
        sellerDao.insert(seller1);
        System.out.println("Inserted! new id = " + seller1.getId());


        System.out.println("\n=== TEST 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Carolina Cedro");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: seller delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete sucessfull");

    }
}
