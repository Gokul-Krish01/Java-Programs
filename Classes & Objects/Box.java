class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box b = new Box(5, 10, 3);
        System.out.println("Volume = " + b.volume());
    }
}
