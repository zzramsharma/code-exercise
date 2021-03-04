package designpatterns.visitor;

public class Bus implements Equipment {
    @Override
    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitBus(this);
    }

    @Override
    public Watt power() {
        return new Watt();
    }

    @Override
    public Currency netPrice() {
        return new Currency();
    }

    @Override
    public Currency discountPrice() {
        return new Currency();
    }
}
