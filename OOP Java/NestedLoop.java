public class NestedIfLoop {
public static void main(String[] args) {
 System.out.println("Number Pattern:");
 for (int i = 1; i <= 5; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(j + " ");
}
System.out.println();
}
System.out.println("\nChecking numbers from 1 to 10:");
for (int num = 1; num <= 10; num++) {
if (num % 2 == 0) {
if (num % 4 == 0) {
System.out.println(num + " is even and divisible by 4");
} else {
 System.out.println(num + " is even but not divisible by 4");
}
} else {
if (num == 1) {
System.out.println(num + " is the first odd number");
} else {
System.out.println(num + " is odd");
}
}
}
}
}