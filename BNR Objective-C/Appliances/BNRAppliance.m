//
//  BNRAppliance.m
//  Appliances
//
//  Created by Anshul Kamath on 4/8/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import "BNRAppliance.h"

@implementation BNRAppliance

- (instancetype)initWithProductName:(NSString *)pn
{
    // Call the NSObject's init method
    // Did it return something non-nil?
    if (self = [super init]) {
        
        // Set the product name
        _productName = [pn copy];
        
        // Give the voltage a starting value
        _voltage = 120;
    }
    
    // Return a pointer to the new object
    return self;
}

- (instancetype)init
{
    return [self initWithProductName:@"Unknown"];
}

- (NSString *)description
{
    return [NSString stringWithFormat:@"<%@: %d volts>", self.productName, self.voltage];
}

- (void)setVoltage:(int)x
{
    NSLog(@"Setting voltage to %d", x);
    _voltage = x;
}

@end
