class Fibonacci {
public static void main(String[] args) {
int a = 0, b = 1, c;
System.out.println("First 20 Fibonacci Series:");
for (int i = 1; i <= 20; i++) {
System.out.print(a + " ");
c = a + b;
a = b;
b = c;
}
}
}