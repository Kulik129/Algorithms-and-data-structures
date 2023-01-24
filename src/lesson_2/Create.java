package lesson_2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Create {
    public static void createNotebook(){
        int count = 10_000;

        List<Notebook> notebookList = new ArrayList<>();
        List<Brand> BRAND = Arrays.asList(Brand.values());

        double[] PRIES = new double[]{99990.0, 159990.0, 60990.0, 49990.0, 59990.0, 30990.0, 20990.0, 180990.0};
        int[] RAM = new int[]{4, 8, 16, 32, 64, 128, 32};

        for (int i = 0; i < count+1; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(PRIES.length);
            int randomRam = ThreadLocalRandom.current().nextInt(RAM.length);
            Random rand = new Random();
            String randomBrand = String.valueOf(BRAND.get(rand.nextInt(BRAND.size())));
            notebookList.add(new Notebook(randomBrand,PRIES[randomIndex],RAM[randomRam]));
        }

        Collections.sort(notebookList, new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                int sortBrand = o1.brand.compareTo(o2.brand);
                int sortPrice = (int) (o1.price - o2.price);
                if (sortBrand != 0) {
                    return sortBrand;
                } else if (sortPrice != 0) {
                    return sortPrice;
                }
                return Integer.valueOf(o1.ram).compareTo(o2.ram);
            }
        });
        System.out.println(notebookList);
    }
}
