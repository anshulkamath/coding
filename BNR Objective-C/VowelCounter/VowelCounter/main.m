//
//  main.m
//  VowelCounter
//
//  Created by Anshul Kamath on 4/8/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "NSString+BNRVowelCounting.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        NSString *string = @"Hello World";
        NSLog(@"%@ has %d vowels", string, [string bnr_vowelCount]);
        
    }
    return 0;
}
