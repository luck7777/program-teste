package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program13List {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Joao");
		list.add("Mauro");
		list.add("Marcos");
		list.add("Lucas");
		list.add("Marcela");
		list.add("Tug");
		list.add(2, "Vanessa");
		
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("______________________________________________");
		
		list.remove("Lucas");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("______________________________________________");
		System.out.println("Localiza Tug: " + list.indexOf("Tug"));
		
		System.out.println("______________________________________________");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("______________________________________________");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		

	}

}
