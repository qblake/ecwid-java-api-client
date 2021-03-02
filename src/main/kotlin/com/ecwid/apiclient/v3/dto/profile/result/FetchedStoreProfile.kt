package com.ecwid.apiclient.v3.dto.profile.result

import com.google.gson.annotations.SerializedName

data class FetchedStoreProfile(
		val generalInfo: GeneralInfo? = null,
		val account: Account? = null,
		val settings: Settings? = null,
		val mailNotifications: MailNotifications? = null,
		val company: Company? = null,
		val formatsAndUnits: FormatsAndUnits? = null,
		val languages: Languages? = null,
		val shipping: Shipping? = null,
		val taxSettings: TaxSettings? = null,
		val zones: List<Zone>? = null,
		val businessRegistrationID: BusinessRegistrationID? = null,
		val legalPagesSettings: LegalPagesSettingsDetails? = null,
		val payment: PaymentInfo? = null,
		val featureToggles: List<FeatureTogglesInfo>? = null,
		val designSettings: DesignSettings? = null,
		val productFiltersSettings: ProductFiltersSettings? = null,
		val fbMessengerSettings: FBMessengerSettings? = null,
		val orderInvoiceSettings: OrderInvoiceSettings? = null,
		val giftCardSettings: GiftCardSettings? = null
) {
	data class GeneralInfo(
			val storeId: Int = 0,
			val storeUrl: String? = null,
			val starterSite: InstantSiteInfo? = null,
			val websitePlatform: WebsitePlatform? = null
	)

	data class InstantSiteInfo(
			val ecwidSubdomain: String? = null,
			val customDomain: String? = null,
			val generatedUrl: String? = null,
			val storeLogoUrl: String? = null
	)

	enum class WebsitePlatform {
		wix, wordpress, iframe, joomla, yola, unknown
	}

	data class Account(
			val accountName: String? = null,
			val accountNickName: String? = null,
			val accountEmail: String? = null,
			val availableFeatures: List<String>? = null,
			val whiteLabel: Boolean? = null
	)

	data class Settings(
			val closed: Boolean? = null,
			val storeName: String? = null,
			val storeDescription: String? = null,
			val invoiceLogoUrl: String? = null,
			val emailLogoUrl: String? = null,
			val googleRemarketingEnabled: Boolean? = null,
			val googleAnalyticsId: String? = null,
			val fbPixelId: String? = null,
			val orderCommentsEnabled: Boolean? = null,
			val orderCommentsCaption: String? = null,
			val orderCommentsRequired: Boolean? = null,
			val hideOutOfStockProductsInStorefront: Boolean? = null,
			val askCompanyName: Boolean? = null,
			val favoritesEnabled: Boolean? = null,
			val defaultProductSortOrder: ProductSortOrder? = null,
			val abandonedSales: AbandonedSalesSettings? = null,
			val salePrice: SalePriceSettings? = null,
			val showAcceptMarketingCheckbox: Boolean? = null,
			val acceptMarketingCheckboxDefaultValue: Boolean? = null,
			val acceptMarketingCheckboxCustomText: String? = null,
			val askConsentToTrackInStorefront: Boolean? = null,
			val snapPixelId: String? = null,
			val pinterestTagId: String? = null,
			val googleTagId: String? = null,
			val googleEventId: String? = null,
			val showPricePerUnit: Boolean = false
	)

	enum class ProductSortOrder {
		DEFINED_BY_STORE_OWNER,
		ADDED_TIME_DESC,
		PRICE_ASC,
		PRICE_DESC,
		NAME_ASC,
		NAME_DESC
	}

	data class AbandonedSalesSettings(
			val autoAbandonedSalesRecovery: Boolean? = null
	)

	data class SalePriceSettings(
			val displayOnProductList: Boolean? = null,
			val oldPriceLabel: String? = null,
			val displayDiscount: DisplayDiscount? = null) {

		enum class DisplayDiscount {
			NONE, ABS, PERCENT
		}
	}

	data class MailNotifications(
			val adminNotificationEmails: List<String>? = null,
			val customerNotificationFromEmail: String? = null
	)

	data class Company(
			val companyName: String? = null,
			val email: String? = null,
			val street: String? = null,
			val city: String? = null,
			val countryCode: String? = null,
			val postalCode: String? = null,
			val stateOrProvinceCode: String? = null,
			val phone: String? = null
	)

	data class FormatsAndUnits(
			val currency: String? = null,
			val currencyPrefix: String? = null,
			val currencySuffix: String? = null,
			val currencyPrecision: String? = null,
			val currencyGroupSeparator: String? = null,
			val currencyDecimalSeparator: String? = null,
			val currencyTruncateZeroFractional: Boolean? = null,
			val currencyRate: Double? = null,
			val weightUnit: WeightUnit? = null,
			val weightPrecision: Int? = null,
			val weightGroupSeparator: String? = null,
			val weightDecimalSeparator: String? = null,
			val weightTruncateZeroFractional: Boolean? = null,
			val dateFormat: String? = null,
			val timeFormat: String? = null,
			val timezone: String? = null,
			val dimensionsUnit: DimensionUnit? = null,
			val orderNumberPrefix: String? = null,
			val orderNumberSuffix: String? = null
	)

	enum class WeightUnit {
		CARAT, GRAM, OUNCE, POUND, KILOGRAM
	}

	enum class DimensionUnit {
		MM, CM, IN, YD
	}

	data class Languages(
			val enabledLanguages: List<String>? = null,
			val facebookPreferredLocale: String? = null,
			val defaultLanguage: String? = null
	)

	data class Shipping(
			val handlingFee: HandlingFee? = null,
			val shippingOrigin: ShippingOrigin? = null,
			val shippingOptions: List<ShippingOption>? = null
	)

	data class HandlingFee(
			val name: String? = null,
			val value: Double? = null,
			val description: String? = null
	)

	data class ShippingOrigin(
			val companyName: String? = null,
			val email: String? = null,
			val street: String? = null,
			val city: String? = null,
			val countryCode: String? = null,
			val postalCode: String? = null,
			val stateOrProvinceCode: String? = null,
			val phone: String? = null
	)

	data class ShippingOption(
			val id: String? = null,
			val title: String? = null,
			val enabled: Boolean? = null,
			val orderBy: Int? = null,
			val fulfillmentType: FulfillmentType? = null,
			val destinationZone: Zone? = null,
			val deliveryTimeDays: String? = null,
			val description: String? = null,
			val carrier: String? = null,
			val carrierMethods: List<CarrierMethod>? = null,
			val carrierSettings: CarrierSettings? = null,
			val ratesCalculationType: RatesCalculationType? = null,
			val shippingCostMarkup: Double? = null,
			val flatRate: FlatRate? = null,
			val ratesTable: TableRatesDetails? = null,
			val appClientId: String? = null,
			val pickupInstruction: String? = null,
			val scheduledPickup: Boolean? = null,
			val pickupPreparationTimeHours: Int? = null,
			val pickupBusinessHours: String? = null
	)

	enum class FulfillmentType {
		pickup, shipping
	}

	data class Zone(
			val id: String? = null,
			val name: String? = null,
			val countryCodes: List<String>? = null,
			val stateOrProvinceCodes: List<String>? = null,
			val postCodes: List<String>? = null
	)

	data class CarrierMethod(
			val id: String? = null,
			val name: String? = null,
			val enabled: Boolean? = null,
			val orderBy: Int? = null
	)

	data class CarrierSettings(
			val defaultCarrierAccountEnabled: Boolean? = null,
			val defaultPostageDimensions: DefaultPostageDimensions? = null
	)

	data class DefaultPostageDimensions(
			val length: Double? = null,
			val width: Double? = null,
			val height: Double? = null
	)

	enum class RatesCalculationType {
		carrier_calculated, table, flat, app;

		override fun toString(): String {
			return super.toString().replace("_", "-")
		}
	}

	fun RatesCalculationType.valueOf(value: String?): RatesCalculationType? {
		return RatesCalculationType.values().firstOrNull { it.toString() == value }
	}

	data class FlatRate(
			val rateType: RateType? = null,
			val rate: Double? = null
	) {
		enum class RateType {
			ABSOLUTE, PERCENT
		}
	}

	data class TableRatesDetails(
			val tableBasedOn: RateBase? = null,
			val rates: List<TableRate>? = null
	) {
		enum class RateBase {
			subtotal, discountedSubtotal, weight
		}

	}

	data class TableRate(
			val tableRateConditions: TableRateConditions? = null,
			val rate: TableRateDetails? = null
	)

	data class TableRateConditions(
			val weightFrom: Double? = null,
			val weightTo: Double? = null,
			val subtotalFrom: Double? = null,
			val subtotalTo: Double? = null,
			val discountedSubtotalFrom: Double? = null,
			val discountedSubtotalTo: Double? = null
	)

	data class TableRateDetails(
			val perOrderAbs: Double? = null,
			val perOrderPercent: Double? = null,
			val perItem: Double? = null,
			val perWeightUnitRate: Double? = null
	)

	data class TaxSettings(
			val automaticTaxEnabled: Boolean? = null,
			val taxes: List<Taxes>? = null,
			val pricesIncludeTax: Boolean? = null,
			val taxExemptBusiness: Boolean = false
	) {
		data class Taxes(
				val id: Int? = null,
				val name: String? = null,
				val enabled: Boolean? = null,
				val includeInPrice: Boolean? = null,
				val useShippingAddress: Boolean? = null,
				val taxShipping: Boolean? = null,
				val appliedByDefault: Boolean? = null,
				val defaultTax: Double? = null,
				val rules: List<TaxRule>? = null
		)

		data class TaxRule(
				val zoneId: String? = null,
				val tax: Double? = null
		)
	}

	data class BusinessRegistrationID(
			val name: String? = null,
			val value: String? = null
	)

	data class LegalPagesSettingsDetails(
			val requireTermsAgreementAtCheckout: Boolean? = null,
			val legalPages: List<LegalPagesInfo>? = null
	)

	data class LegalPagesInfo(
			val type: Type? = null,
			val enabled: Boolean? = null,
			val title: String? = null,
			val display: Display? = null,
			val text: String? = null,
			val externalUrl: String? = null
	) {
		enum class Type {
			LEGAL_INFO, SHIPPING_COST_PAYMENT_INFO, REVOCATION_TERMS, TERMS, PRIVACY_STATEMENT
		}

		enum class Display {
			INLINE, EXTERNAL_URL
		}
	}

	data class PaymentInfo(
			val paymentOptions: List<PaymentOptionInfo>? = null,
			val applePay: ApplePay? = null
	)

	data class PaymentOptionInfo(
			val id: String? = null,
			val enabled: Boolean? = null,
			val checkoutTitle: String? = null,
			val checkoutDescription: String? = null,
			val paymentProcessorId: String? = null,
			val paymentProcessorTitle: String? = null,
			val orderBy: Int? = null,
			val appClientId: String? = null,
			val instructionsForCustomer: InstructionsForCustomerInfo? = null
	)

	data class ApplePay(
			val enabled: Boolean = false,
			val available: Boolean = false,
			val gateway: String? = null,
			val verificationFileUrl: String? = null
	)

	data class InstructionsForCustomerInfo(
			val instructionsTitle: String? = null,
			val instructions: String? = null
	)

	data class FeatureTogglesInfo(
			val name: String? = null,
			val visible: Boolean? = null,
			val enabled: Boolean? = null
	)

	data class DesignSettings(
			@SerializedName("enable_catalog_on_one_page")
			val enableCatalogOnOnePage: Boolean? = null,

			@SerializedName("product_list_image_size")
			val productListImageSize: String? = null,

			@SerializedName("product_list_image_aspect_ratio")
			val productListImageLayout: String? = null,

			@SerializedName("product_list_image_position")
			val productListImagePosition: String? = null,

			@SerializedName("product_list_category_image_size")
			val productListCategoryImageSize: String? = null,

			@SerializedName("product_list_category_image_aspect_ratio")
			val productListCategoryImageLayout: String? = null,

			@SerializedName("product_list_category_image_position")
			val productListCategoryImagePosition: String? = null,

			@SerializedName("product_list_show_product_images")
			val productListShowProductImages: Boolean? = null,

			@SerializedName("product_list_product_info_layout")
			val productListCardLayout: String? = null,

			@SerializedName("product_list_show_frame")
			val productListShowCardFrame: Boolean? = null,

			@SerializedName("product_list_show_additional_image_on_hover")
			val productListShowAdditionalImage: Boolean? = null,

			@SerializedName("product_list_title_behavior")
			val productListNameBehaviour: String? = null,

			@SerializedName("product_list_price_behavior")
			val productListPriceBehaviour: String? = null,

			@SerializedName("product_list_sku_behavior")
			val productListSKUBehaviour: String? = null,

			@SerializedName("product_list_buybutton_behavior")
			val productListBuyNowBehaviour: String? = null,

			@SerializedName("product_list_category_title_behavior")
			val productListCategoryNameBehaviour: String? = null,

			@SerializedName("product_list_image_has_shadow")
			val productListImageHasShadow: Boolean? = null,

			@SerializedName("show_signin_link")
			val productListShowSignInLink: Boolean? = null,

			@SerializedName("show_footer_menu")
			val productListShowFooterMenu: Boolean? = null,

			@SerializedName("show_breadcrumbs")
			val productListShowBreadcrumbs: Boolean? = null,

			@SerializedName("product_list_show_sort_viewas_options")
			val productListShowSortViewAsOptions: Boolean? = null,

			@SerializedName("product_list_show_on_sale_label")
			val productListShowOnSaleLabel: Boolean? = null,

			@SerializedName("product_list_show_name_your_price_label")
			val productListShowPayWhatYouWantLabel: Boolean? = null,

			@SerializedName("product_list_show_sold_out_label")
			val productListShowSoldOutLabel: Boolean? = null,

			@SerializedName("product_details_show_product_sku")
			val productDetailsShowProductSku: Boolean? = null,

			@SerializedName("product_details_additional_images_has_shadow")
			val productDetailsAdditionalImagesHasShadow: Boolean? = null,

			@SerializedName("product_details_image_carousel")
			val productDetailsImageCarousel: Boolean? = null,

			@SerializedName("product_details_additional_images_preview_on_click")
			val productDetailsAdditionalImagesPreviewOnClick: Boolean? = null,

			@SerializedName("product_details_layout")
			val productDetailsLayout: String? = null,

			@SerializedName("product_details_two_columns_with_right_sidebar_show_product_description_on_sidebar")
			val productDetailsTwoColumnsWithRightSidebarShowProductDescriptionOnSidebar: Boolean? = null,

			@SerializedName("product_details_two_columns_with_left_sidebar_show_product_description_on_sidebar")
			val productDetailsTwoColumnsWithLeftSidebarShowProductDescriptionOnSidebar: Boolean? = null,

			@SerializedName("product_details_show_product_name")
			val productDetailsShowProductName: Boolean? = null,

			@SerializedName("product_details_show_breadcrumbs")
			val productDetailsShowBreadcrumbs: Boolean? = null,

			@SerializedName("product_details_show_product_price")
			val productDetailsShowProductPrice: Boolean? = null,

			@SerializedName("product_details_show_sale_price")
			val productDetailsShowSalePrice: Boolean? = null,

			@SerializedName("product_details_show_tax")
			val productDetailsShowTax: Boolean? = null,

			@SerializedName("product_details_show_attributes")
			val productDetailsShowAttributes: Boolean? = null,

			@SerializedName("product_details_show_weight")
			val productDetailsShowWeight: Boolean? = null,

			@SerializedName("product_details_show_product_description")
			val productDetailsShowProductDescription: Boolean? = null,

			@SerializedName("product_details_show_product_options")
			val productDetailsShowProductOptions: Boolean? = null,

			@SerializedName("product_details_show_buy_button")
			val productDetailsShowBuyButton: Boolean? = null,

			@SerializedName("product_details_show_wholesale_prices")
			val productDetailsShowWholesalePrices: Boolean? = null,

			@SerializedName("product_details_show_save_for_later")
			val productDetailsShowSaveForLater: Boolean? = null,

			@SerializedName("product_details_show_share_buttons")
			val productDetailsShowShareButtons: Boolean? = null,

			@SerializedName("product_details_show_product_name_always_first_on_mobile")
			val productDetailsShowProductNameAlwaysFirstOnMobile: Boolean? = null,

			@SerializedName("product_details_position_product_name")
			val productDetailsPositionProductName: Int? = null,

			@SerializedName("product_details_position_breadcrumbs")
			val productDetailsPositionBreadcrumbs: Int? = null,

			@SerializedName("product_details_position_product_sku")
			val productDetailsPositionProductSku: Int? = null,

			@SerializedName("product_details_position_product_price")
			val productDetailsPositionProductPrice: Int? = null,

			@SerializedName("product_details_position_product_options")
			val productDetailsPositionProductOptions: Int? = null,

			@SerializedName("product_details_position_buy_button")
			val productDetailsPositionBuyButton: Int? = null,

			@SerializedName("product_details_position_wholesale_prices")
			val productDetailsPositionWholesalePrices: Int? = null,

			@SerializedName("product_details_position_product_description")
			val productDetailsPositionProductDescription: Int? = null,

			@SerializedName("product_details_position_save_for_later")
			val productDetailsPositionSaveForLater: Int? = null,

			@SerializedName("product_details_position_share_buttons")
			val productDetailsPositionShareButtons: Int? = null,

			@SerializedName("product_details_hide_price_modifiers")
			val productDetailsHidePriceModifiers: Boolean? = null,

			@SerializedName("product_details_show_price_per_unit")
			val productDetailsShowPricePerUnit: Boolean? = null,

			@SerializedName("product_details_cut_product_description_in_sidebar")
			val productDetailsCutProductDescriptionInSidebar: Boolean? = null,

			@SerializedName("product_details_thumbnails_aspect_ratio")
			val productDetailsThumbnailsAspectRatio: String? = null,

			@SerializedName("product_details_show_qty")
			val productDetailsShowQty: Boolean? = null,

			@SerializedName("product_details_show_in_stock_label")
			val productDetailsShowInStockLabel: Boolean? = null,

			@SerializedName("product_details_show_number_of_items_in_stock")
			val productDetailsShowNumberOfItemsInStock: Boolean? = null,

			@SerializedName("product_details_gallery_layout")
			val productDetailsGalleryLayout: String? = null,

			@SerializedName("product_details_show_facebook_share_button")
			val productDetailsShowFacebookShareButton: Boolean? = null,

			@SerializedName("product_details_show_twitter_share_button")
			val productDetailsShowTwitterShareButton: Boolean? = null,

			@SerializedName("product_details_show_pinterest_share_button")
			val productDetailsShowPinterestShareButton: Boolean? = null,

			@SerializedName("product_details_show_vk_share_button")
			val productDetailsShowVkShareButton: Boolean? = null,

			@SerializedName("enable_simple_category_list")
			val enableSimpleCategoryList: Boolean? = null,

			@SerializedName("enable_page_transitions")
			val enablePageTransitions: Boolean? = null,

			@SerializedName("product_filters_opened_by_default_on_category_page")
			val productFiltersOpenedByDefaultOnCategoryPage: Boolean? = null,

			@SerializedName("product_filters_position_category_page")
			val productFiltersPositionCategoryPage: String? = null,

			@SerializedName("show_root_categories")
			val showRootCategories: Boolean? = null,

			@SerializedName("product_details_show_subtitle")
			val productDetailsShowSubtitle: Boolean? = null,

			@SerializedName("product_details_position_subtitle")
			val productDetailsPositionSubtitle: Int? = null,

			@SerializedName("product_list_subtitles_behavior")
			val productListSubtitlesBehavior: String? = null
	)

	data class ProductFiltersSettings(
			val enabledInStorefront: Boolean? = null
	)

	data class FBMessengerSettings(
			val enabled: Boolean? = null,
			val fbMessengerPageId: String? = null,
			val fbMessengerThemeColor: String? = null,
			val fbMessengerMessageUsButtonColor: String? = null
	)

	data class OrderInvoiceSettings(
			val displayOrderInvoices: Boolean? = null,
			val attachInvoiceToOrderEmailNotifications: AttachValue? = null,
			val invoiceLogoUrl: String? = null
	) {
		enum class AttachValue {
			ATTACH_TO_ALL_EMAILS, DO_NOT_ATTACH
		}
	}

	data class GiftCardSettings(
			val products: List<GiftCardProducts>? = null,
			val displayLocation: String? = null
	)

	data class GiftCardProducts(
			val id: Int? = null,
			val name: String? = null,
			val url: String? = null
	)

}
