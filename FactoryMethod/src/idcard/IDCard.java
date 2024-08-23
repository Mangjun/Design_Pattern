package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCARD:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
