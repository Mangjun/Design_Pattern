package computer;

import framework.Product;

public class Computer extends Product {
    private String owner;

    // 외부에서 생성 불가
    Computer(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "를 통해 코드를 작성합니다.");
    }

    @Override
    public String toString() {
        return "[Computer: " + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
