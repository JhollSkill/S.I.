/* 2.  Dado um n�mero inteiro positivo n, calcular a soma dos n primeiros n�meros inteiros positivos. */

#include <stdio.h>

int main() {
	int n,		/* guarda o numero dado */
		i,		/* contador */
		soma;	/* guarda as somas parciais */
		
	printf("\n\tCalculo da soma dos n primeiros inteiros positivos\n");
	
	/* Inicializa��es */
	printf("\nDigite o valor de n: ");
	scanf("%d", &n);
	soma = 0;
	i = 1;
	
	/* C�lculo da soma */
	while (i <= n) {
		soma = soma + i;
		i = i + 1;
	}
	
	/* Escreve a resposta */
	printf("A soma dos %d primeiros inteiros positivos e' %d\n", n, soma);
	
	return 0;
}
