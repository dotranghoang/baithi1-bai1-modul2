import java.util.Arrays;

public class ManageProduct<E> {
    private int size = 0;
    private static final int CAPACITY = 10;
    private Object priceProduct[];
    private Object nameProduct[];


    public ManageProduct() {
        priceProduct = new Object[CAPACITY];
        nameProduct = new Object[CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = CAPACITY * 2;
        priceProduct = Arrays.copyOf(priceProduct, newSize);
        nameProduct = Arrays.copyOf(nameProduct, newSize);
    }

    public void add(String nameProduct, float priceProduct) {
        if (size == CAPACITY) {
            ensureCapacity();
        }

        if (this.nameProduct[0] == null && this.priceProduct[0] == null) {
            this.nameProduct[0] = nameProduct;
            this.priceProduct[0]       = priceProduct;
            size++;
        } else {
            for (int i = 0; this.priceProduct[i] != null; i++) {
                if(this.priceProduct[i + 1] == null) {
                    this.nameProduct[i + 1] = nameProduct;
                    this.priceProduct[i + 1] = priceProduct;
                    size++;
                    break;
                }
            }
        }
    }

    public String getInformation() {
        String infor = "";
        for (int i = 0; priceProduct[i] != null; i++) {
            infor +=  "Index: " + i + "\n" +  " Name: " + nameProduct[i] + "  Price: " + priceProduct[i] + "\n";
        }
        return infor;
    }

    public int getSize() {
        return size;
    }

    public void removeProduct(int index) {

        for (int i = index; i < nameProduct.length ; i++) {
            nameProduct[i] = nameProduct[i + 1];
            priceProduct[i] = priceProduct[i + 1];
            if(nameProduct[i+1] == null) {
                break;
            }
            size--;
        }
    }

    public void setName(int index , String newNameProduct ) {
        nameProduct[index] = newNameProduct;
    }

    public void setPrice(int index , float newPriceProduct ) {
        priceProduct[index] = newPriceProduct;
    }

    public void setProductInfor(int index , String newNameProduct , float newPriceProduct ) {
        nameProduct[index] = newNameProduct;
        priceProduct[index] = newPriceProduct;
    }

    public String searchProduct(String ProductName) {
        String check = "";
        for(int i = 0 ; i < nameProduct.length ; i++ ) {
            if(nameProduct[i] == ProductName) {
                check = "Index: " + i + "\n" +  " Name: " + nameProduct[i] + "  Price: " + priceProduct[i] ;
            }
        }
        return check;
    }
}