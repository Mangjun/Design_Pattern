package computer;

import framework.Factory;
import framework.Product;

public class ComputerFactory extends Factory {
    
    // getInstance()로 사용해도 됨
    @Override
    protected Product createProduct(String owner) {
        return new Computer(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
