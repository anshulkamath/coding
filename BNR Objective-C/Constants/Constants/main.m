//
//  main.m
//  Constants
//
//  Created by Anshul Kamath on 4/7/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        // insert code here...
        
        NSLog(@"\u03c0 is %f", M_PI);
        NSLog(@"%d is greater", MAX(10, 12));
        
        NSLocale *here = [NSLocale currentLocale];
        NSString *currency = [here objectForKey:NSLocaleCurrencyCode];
        NSLog(@"Money is %@", currency);
        
    }
    return 0;
}
