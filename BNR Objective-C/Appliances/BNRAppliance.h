//
//  BNRAppliance.h
//  Appliances
//
//  Created by Anshul Kamath on 4/8/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface BNRAppliance : NSObject

@property (nonatomic, copy) NSString *productName;
@property (nonatomic) int voltage;

// This is the designated initializer
- (instancetype)initWithProductName:(NSString *)pn;

@end
