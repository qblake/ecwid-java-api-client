package com.ecwid.apiclient.v3.rule.nullablepropertyrules

import com.ecwid.apiclient.v3.dto.cart.request.OrderForCalculate
import com.ecwid.apiclient.v3.rule.NullablePropertyRule
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.AllowNullable
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.IgnoreNullable

val orderForCalculateNullablePropertyRules: List<NullablePropertyRule<*, *>> = listOf(
	IgnoreNullable(OrderForCalculate::billingPerson),
	IgnoreNullable(OrderForCalculate::customerId),
	AllowNullable(OrderForCalculate::customerTaxExempt),
	AllowNullable(OrderForCalculate::customSurcharges),
	IgnoreNullable(OrderForCalculate::discountCoupon),
	IgnoreNullable(OrderForCalculate::discountInfo),
	IgnoreNullable(OrderForCalculate::email),
	AllowNullable(OrderForCalculate::handlingFee),
	IgnoreNullable(OrderForCalculate::ipAddress),
	IgnoreNullable(OrderForCalculate::items),
	AllowNullable(OrderForCalculate::paymentOptionsDetails),
	AllowNullable(OrderForCalculate::shippingOption),
	IgnoreNullable(OrderForCalculate::shippingPerson),
	AllowNullable(OrderForCalculate.CustomSurcharge::description),
	AllowNullable(OrderForCalculate.CustomSurcharge::id),
	AllowNullable(OrderForCalculate.CustomSurcharge::taxable),
	AllowNullable(OrderForCalculate.CustomSurcharge::type),
	AllowNullable(OrderForCalculate.CustomSurcharge::value),
	IgnoreNullable(OrderForCalculate.DiscountCouponCatalogLimit::categories),
	IgnoreNullable(OrderForCalculate.DiscountCouponCatalogLimit::products),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::applicationLimit),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::catalogLimit),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::code),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::creationDate),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::discount),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::discountType),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::expirationDate),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::launchDate),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::name),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::orderCount),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::status),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::totalLimit),
	IgnoreNullable(OrderForCalculate.DiscountCouponInfo::usesLimit),
	IgnoreNullable(OrderForCalculate.DiscountInfo::base),
	IgnoreNullable(OrderForCalculate.DiscountInfo::description),
	IgnoreNullable(OrderForCalculate.DiscountInfo::orderTotal),
	IgnoreNullable(OrderForCalculate.DiscountInfo::type),
	IgnoreNullable(OrderForCalculate.DiscountInfo::value),
	AllowNullable(OrderForCalculate.HandlingFee::description),
	AllowNullable(OrderForCalculate.HandlingFee::name),
	AllowNullable(OrderForCalculate.HandlingFee::taxes),
	AllowNullable(OrderForCalculate.HandlingFee::value),
	AllowNullable(OrderForCalculate.HandlingFeeTax::name),
	AllowNullable(OrderForCalculate.HandlingFeeTax::value),
	AllowNullable(OrderForCalculate.HandlingFeeTax::total),
	IgnoreNullable(OrderForCalculate.OrderItem::categoryId),
	IgnoreNullable(OrderForCalculate.OrderItem::couponAmount),
	IgnoreNullable(OrderForCalculate.OrderItem::couponApplied),
	IgnoreNullable(OrderForCalculate.OrderItem::digital),
	IgnoreNullable(OrderForCalculate.OrderItem::dimensions),
	IgnoreNullable(OrderForCalculate.OrderItem::discounts),
	IgnoreNullable(OrderForCalculate.OrderItem::files),
	IgnoreNullable(OrderForCalculate.OrderItem::fixedShippingRate),
	IgnoreNullable(OrderForCalculate.OrderItem::fixedShippingRateOnly),
	IgnoreNullable(OrderForCalculate.OrderItem::id),
	IgnoreNullable(OrderForCalculate.OrderItem::imageUrl),
	IgnoreNullable(OrderForCalculate.OrderItem::isShippingRequired),
	IgnoreNullable(OrderForCalculate.OrderItem::name),
	IgnoreNullable(OrderForCalculate.OrderItem::price),
	IgnoreNullable(OrderForCalculate.OrderItem::productId),
	IgnoreNullable(OrderForCalculate.OrderItem::productPrice),
	IgnoreNullable(OrderForCalculate.OrderItem::quantity),
	IgnoreNullable(OrderForCalculate.OrderItem::quantityInStock),
	IgnoreNullable(OrderForCalculate.OrderItem::selectedOptions),
	IgnoreNullable(OrderForCalculate.OrderItem::shipping),
	IgnoreNullable(OrderForCalculate.OrderItem::shortDescription),
	IgnoreNullable(OrderForCalculate.OrderItem::sku),
	IgnoreNullable(OrderForCalculate.OrderItem::tax),
	IgnoreNullable(OrderForCalculate.OrderItem::taxes),
	IgnoreNullable(OrderForCalculate.OrderItem::trackQuantity),
	IgnoreNullable(OrderForCalculate.OrderItem::weight),
	IgnoreNullable(OrderForCalculate.OrderItemDiscountInfo::base),
	IgnoreNullable(OrderForCalculate.OrderItemDiscountInfo::orderTotal),
	IgnoreNullable(OrderForCalculate.OrderItemDiscountInfo::type),
	IgnoreNullable(OrderForCalculate.OrderItemDiscountInfo::value),
	IgnoreNullable(OrderForCalculate.OrderItemDiscounts::discountInfo),
	IgnoreNullable(OrderForCalculate.OrderItemDiscounts::total),
	IgnoreNullable(OrderForCalculate.OrderItemOptionFile::id),
	IgnoreNullable(OrderForCalculate.OrderItemOptionFile::name),
	IgnoreNullable(OrderForCalculate.OrderItemOptionFile::size),
	IgnoreNullable(OrderForCalculate.OrderItemOptionFile::url),
	IgnoreNullable(OrderForCalculate.OrderItemOption::files),
	IgnoreNullable(OrderForCalculate.OrderItemOption::name),
	IgnoreNullable(OrderForCalculate.OrderItemOption::selections),
	IgnoreNullable(OrderForCalculate.OrderItemOption::type),
	IgnoreNullable(OrderForCalculate.OrderItemOption::value),
	IgnoreNullable(OrderForCalculate.OrderItemOption::valuesArray),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::adminUrl),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::customerUrl),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::description),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::expire),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::maxDownloads),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::name),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::productFileId),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::remainingDownloads),
	IgnoreNullable(OrderForCalculate.OrderItemProductFile::size),
	IgnoreNullable(OrderForCalculate.OrderItemTax::includeInPrice),
	IgnoreNullable(OrderForCalculate.OrderItemTax::name),
	IgnoreNullable(OrderForCalculate.OrderItemTax::taxOnDiscountedSubtotal),
	IgnoreNullable(OrderForCalculate.OrderItemTax::taxOnShipping),
	IgnoreNullable(OrderForCalculate.OrderItemTax::total),
	IgnoreNullable(OrderForCalculate.OrderItemTax::value),
	AllowNullable(OrderForCalculate.PaymentOption::paymentId),
	IgnoreNullable(OrderForCalculate.PersonInfo::city),
	IgnoreNullable(OrderForCalculate.PersonInfo::companyName),
	IgnoreNullable(OrderForCalculate.PersonInfo::countryCode),
	IgnoreNullable(OrderForCalculate.PersonInfo::countryName),
	IgnoreNullable(OrderForCalculate.PersonInfo::name),
	IgnoreNullable(OrderForCalculate.PersonInfo::phone),
	IgnoreNullable(OrderForCalculate.PersonInfo::postalCode),
	IgnoreNullable(OrderForCalculate.PersonInfo::stateOrProvinceCode),
	IgnoreNullable(OrderForCalculate.PersonInfo::stateOrProvinceName),
	IgnoreNullable(OrderForCalculate.PersonInfo::street),
	IgnoreNullable(OrderForCalculate.ProductDimensions::height),
	IgnoreNullable(OrderForCalculate.ProductDimensions::length),
	IgnoreNullable(OrderForCalculate.ProductDimensions::width),
	IgnoreNullable(OrderForCalculate.SelectionInfo::selectionModifier),
	IgnoreNullable(OrderForCalculate.SelectionInfo::selectionModifierType),
	IgnoreNullable(OrderForCalculate.SelectionInfo::selectionTitle),
	AllowNullable(OrderForCalculate.ShippingOption::fulfillmentType),
	AllowNullable(OrderForCalculate.ShippingOption::pickupInstruction),
	AllowNullable(OrderForCalculate.ShippingOption::shippingMethodId),
	AllowNullable(OrderForCalculate.ShippingOption::shippingMethodName),
	AllowNullable(OrderForCalculate.ShippingOption::shippingRate),
)
