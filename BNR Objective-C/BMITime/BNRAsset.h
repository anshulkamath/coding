//
//  BNRAsset.h
//  BMITime
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 ChoppSopht LLC. All rights reserved.
//

#import <Foundation/Foundation.h>
@class BNREmployee;

@interface BNRAsset : NSObject

@property (nonatomic, copy) NSString *label;
@property (nonatomic) unsigned int resaleValue;
@property (nonatomic, weak) BNREmployee *holder;


@end
