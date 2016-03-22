//
//  main.m
//  VowelMovement
//
//  Created by Anshul Kamath on 4/7/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

typedef void (^ArrayEnumeratingBlock)(id, NSUInteger, BOOL *);

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        // Create an array of strings and a container for devowelized ones
        NSArray *orignalStrings = @[@"Saukerat", @"Raygun", @"Big Nerd Ranch", @"Mississippi"];
        
        NSLog(@"Original strings: %@", orignalStrings);
        
        NSMutableArray *devowelizedStrings = [NSMutableArray array];
        
        // Create a list of characters to be removed from the string
        NSArray *vowels = @[@"a", @"e", @"i", @"o", @"u"];
        
        // Declare the block variable
        ArrayEnumeratingBlock devowelizer;
        
        // Compose a block and assign it to a variable
        devowelizer = ^(id string, NSUInteger i, BOOL *stop) {
            
            NSRange yRange = [string rangeOfString:@"y"
                                           options:NSCaseInsensitiveSearch];
            
            // Did I find a y?
            if (yRange.location != NSNotFound) {
                *stop = YES; // Stops the block
                return; // End this iteration
            }
            
            
            NSMutableString *newString = [NSMutableString stringWithString:string];
            
            // Iterate over the array with vowels, replacing occurences of each with an empty string
            
            for (NSString *s in vowels) {
                NSRange fullRange = NSMakeRange(0, [newString length]);
                [newString replaceOccurrencesOfString:s
                                           withString:@" "
                                              options:NSCaseInsensitiveSearch
                                                range:fullRange];
            }
            
            [devowelizedStrings addObject:newString];
            
        }; // End of block assignment
        
        // Iterate over the array with your block
        [orignalStrings enumerateObjectsUsingBlock:devowelizer];
        NSLog(@"The devowelized strings are: %@", devowelizedStrings);
    }
    return 0;
}
