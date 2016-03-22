//
//  main.m
//  Appliances
//
//  Created by Anshul Kamath on 4/8/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "BNRAppliance.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        BNRAppliance *a = [[BNRAppliance alloc] init];
        NSLog(@"A is a %@", a);
        [a setValue:@"Toaster" forKey:@"productName"];
        [a setValue:[NSNumber numberWithInt:240] forKey:@"voltage"];
        NSLog(@"A is a %@",a);
        
        NSLog(@"The product name is %@", [a valueForKey:@"productName"]);
        
    }
    return 0;
}
