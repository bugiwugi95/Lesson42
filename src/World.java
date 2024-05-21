public class Sports implements CategoryNews {



    @Override
    public void printNews(String newsCat) {
        int categoryStart = newsCat.lastIndexOf("author");
        int categoryEnd = newsCat.lastIndexOf("content");
        String cat = newsCat.substring(categoryStart + 9, categoryEnd - 3);
        int contentStart = newsCat.lastIndexOf("content");
        int contentEnd = newsCat.lastIndexOf("date");
        String cat1 = newsCat.substring(contentStart + 10, contentEnd - 3);
        System.out.println(cat + "\n" + cat1);


    }





}
