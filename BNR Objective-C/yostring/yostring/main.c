//
//  main.c
//  yostring
//
//  Created by Anshul Kamath on 4/9/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#include <stdio.h> // For printf
#include <stdlib.h> // For malloc/free
#include <string.h> // For strlen

int main(int argc, const char * argv[]) {
    
    char x = '!'; //The character !
    
    while (x <= '~') {
        printf("%x is %c\n", x, x);
        x++;
    }
    
    // Put Love into start
    const char *start = "A backlash after two newlines and a tab:\n\n\t\\";
    
    // Print out the string and its length
    printf("%s has %zu characters\n", start, strlen(start));
    
    // Print out the third letter
    printf("The third letter is %c\n", *(start +2));
    
    return 0;
    
}
