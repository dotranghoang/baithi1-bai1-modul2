public class TestManageProduct {
    public static void main(String[] args) {
        ManageProduct<Object> listProduct = new ManageProduct<>();
        listProduct.add("Nokia" , (float) 27.2);
        listProduct.add("Iphone" , (float) 32.2);
        listProduct.add("Xiaomi" , (float) 32.2);
        listProduct.add("Huway" , (float) 32.2);


//        System.out.println(listProduct.getInformation());
        System.out.println(listProduct.getSize());
//        listProduct.removeProduct(1);
//        listProduct.setName(0 , "Xiaomi");
//        listProduct.setPrice(1 , (float) 25.7);
        System.out.println(listProduct.getInformation());
        System.out.println(listProduct.searchProduct("Huway"));


    }
}
