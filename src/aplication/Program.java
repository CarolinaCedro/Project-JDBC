package aplication;

import model.DAO.DaoFactory;
import model.DAO.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
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
    }
}
