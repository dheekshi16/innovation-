class Computer {
    String brand;
    String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    class Processor {
        double speed;
        int cores;

        public Processor(double speed, int cores) {
            this.speed = speed;
            this.cores = cores;
        }

        public void getDetails() {
            System.out.println("Processor speed: " + speed + " GHz, Cores: " + cores);
        }
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    public void showRAMDetails() {
        class RAM {
            int size;
            String type;

            public RAM(int size, String type) {
                this.size = size;
                this.type = type;
            }

            public void getRAMDetails() {
                System.out.println("RAM Size: " + size + " GB, Type: " + type);
            }
        }

        RAM ram = new RAM(16, "DDR4");
        ram.getRAMDetails();
    }

    public void runTask() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running in an anonymous inner class.");
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "XPS 13");
        computer.showDetails();
        Computer.Processor processor = computer.new Processor(3.5, 8);
        processor.getDetails();

        computer.showRAMDetails();

        computer.runTask();
    }
}
