package com.company.ex18;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

//region Create Products
        Product product1 = new Product();
        product1.setTitle("Apple");
        product1.setPrice(random.nextInt(51) + 50);
        product1.setRating(random.nextInt(11));

        Product product2 = new Product();
        product2.setTitle("Avocado");
        product2.setPrice(random.nextInt(51) + 50);
        product2.setRating(random.nextInt(11));

        Product product3 = new Product();
        product3.setTitle("Pineapple");
        product3.setPrice(random.nextInt(51) + 50);
        product3.setRating(random.nextInt(11));

        Product product4 = new Product();
        product4.setTitle("Mango");
        product4.setPrice(random.nextInt(51) + 50);
        product4.setRating(random.nextInt(11));

        Product product5 = new Product();
        product5.setTitle("Papaya");
        product5.setPrice(random.nextInt(51) + 50);
        product5.setRating(random.nextInt(11));

        Product product6 = new Product();
        product6.setTitle("Nectarine");
        product6.setPrice(random.nextInt(51) + 50);
        product6.setRating(random.nextInt(11));

        Product product7 = new Product();
        product7.setTitle("Pomegranate");
        product7.setPrice(random.nextInt(51) + 50);
        product7.setRating(random.nextInt(11));

        Product product8 = new Product();
        product8.setTitle("Orange");
        product8.setPrice(random.nextInt(51) + 50);
        product8.setRating(random.nextInt(11));

        Product product9 = new Product();
        product9.setTitle("Lemon");
        product9.setPrice(random.nextInt(51) + 50);
        product9.setRating(random.nextInt(11));

        Product product10 = new Product();
        product10.setTitle("Kiwi");
        product10.setPrice(random.nextInt(51) + 50);
        product10.setRating(random.nextInt(11));

//endregion

//region Create ArrayList rating and ArrayList title
        ArrayList<Integer> rating = new ArrayList<>();
        rating.add(product1.getRating());
        rating.add(product2.getRating());
        rating.add(product3.getRating());
        rating.add(product4.getRating());
        rating.add(product5.getRating());
        rating.add(product6.getRating());
        rating.add(product7.getRating());
        rating.add(product8.getRating());
        rating.add(product9.getRating());
        rating.add(product10.getRating());

        System.out.println("Rating "+rating);

        ArrayList<String> title = new ArrayList<>();
        title.add(product1.getTitle());
        title.add(product2.getTitle());
        title.add(product3.getTitle());
        title.add(product4.getTitle());
        title.add(product5.getTitle());
        title.add(product6.getTitle());
        title.add(product7.getTitle());
        title.add(product8.getTitle());
        title.add(product9.getTitle());
        title.add(product10.getTitle());

        System.out.println("Title"+title);
//endregion

        int maxRat=rating.get(0);
        for(int i=1;i<rating.size();i++){
            if(maxRat< rating.get(i)){
                maxRat=rating.get(i);
            }
        }
        for(int i=1;i<rating.size();i++){
            if(maxRat== rating.get(i)){
                System.out.println("Best rating product : "+title.get(i));
            }
        }
    }
}