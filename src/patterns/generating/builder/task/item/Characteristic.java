package patterns.generating.builder.task.item;

public class Characteristic {
    private String brand;
    private String color;
    private String ram;
    private String cpu;
    private String os;
    private String weight;
    private String memory;
    private String memoryType;
    private String battery;
    private String body;
    private String wheel;

    private Characteristic(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.os = builder.os;
        this.weight = builder.weight;
        this.memory = builder.memory;
        this.memoryType = builder.memoryType;
        this.battery = builder.battery;
        this.body = builder.body;
        this.wheel = builder.wheel;
    }

    public static Builder builder(){
        return new Builder();
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOs() {
        return os;
    }

    public String getWeight() {
        return weight;
    }

    public String getMemory() {
        return memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public String getBattery() {
        return battery;
    }

    public String getBody() {
        return body;
    }

    public String getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "[" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", weight='" + weight + '\'' +
                ", memory='" + memory + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", battery='" + battery + '\'' +
                ", body='" + body + '\'' +
                ", wheel='" + wheel + '\'' +
                ']';
    }

    public static class Builder{
        private String brand;
        private String color;
        private String ram;
        private String wheel;
        private String cpu;
        private String os;
        private String weight;
        private String memory;
        private String memoryType;
        private String battery;
        private String body;

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }
        public Builder memoryType(String memoryType){
            this.memoryType = memoryType;
            return this;
        }
        public Builder body(String body){
            this.body = body;
            return this;
        }
        public Builder battery(String battery){
            this.battery = battery;
            return this;
        }
        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder os(String os){
            this.os = os;
            return this;
        }
        public Builder weight(String weight){
            this.weight = weight;
            return this;
        }
        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }
        public Builder wheel(String wheel){
            this.wheel = wheel;
            return this;
        }

        public Characteristic build(){
            return new Characteristic(this);
        }

    }
}
