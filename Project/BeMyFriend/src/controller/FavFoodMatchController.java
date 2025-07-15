package controller;

import java.util.ArrayList;

import model.StudentDAO;

public class FavFoodMatchController {

	public static ArrayList<String> findStudentsByFood(String foodName) throws Exception{
		return StudentDAO.findStudentsByFood(foodName);
	}
}
