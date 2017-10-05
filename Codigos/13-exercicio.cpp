#include <stdio.h>

int somatoria(int n) {
	if (n>0) {
		return n + somatoria(n-1);
	} else {
		return 0;
	}
}

main() {
	int n, s;
	printf("N: ");
	scanf("%d", &n);
	s = somatoria(n);
	printf("Somatoria de %d = %d", n, s);
}
