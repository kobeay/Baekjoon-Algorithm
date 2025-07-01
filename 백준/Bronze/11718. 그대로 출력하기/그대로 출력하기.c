#include <stdio.h>

#define MAX 100

int main(void) {
    char str[MAX];

    while (fgets(str, sizeof(str), stdin) != NULL) {
        printf("%s", str);
    }

    return 0;
}
