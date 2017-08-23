package com.zs.toucheventreturnfalse;

import java.util.List;

/**
 * User: ZhengShuai
 * Date: 2017-02-23
 * Time: 10:47
 * desc:
 */
public class bean {

    /**
     * action_time : 1487817386
     * code : 100
     * data : {"client":{"account_name":"","address":[{"address":"四川省 成都市 武侯区 巴特耐尔家庭服务(天府五街服务点)","address_detail":"哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈","address_id":"758","city_id":"28","consignee":"古胖胖开发专用","contact":"郑帅","is_default":"T","phone":"15122222222"}],"bank":"","bank_account":"","invoice_title":"","taxpayer_number":""},"common_set":{"added_tax_invoice":"T","added_tax_invoice_point":7,"plain_invoice":"T","plain_invoice_point":5},"delivery":["上门自取","货运","快递","送货上门","其他"],"goods":{"list":[{"base_units":"个","goods_id":"4302","goods_name":"（多规格）有库存，停售","goods_picture":"","is_multi":1,"option_data":[{"discount_price":"22.00","number":"1.00","options_name":"8英寸导航内置流动测速一体机"},{"discount_price":"32.00","number":"2.00","options_name":"32G+降压线+安全锤"}]},{"base_units":"千克","goods_id":"4297","goods_name":"恒都 羔羊后腿 2kg/袋（多规格）","goods_picture":"","is_multi":1,"option_data":[{"discount_price":"20.00","number":"1.00","options_name":"1KG"},{"discount_price":"20.00","number":"2.00","options_name":"2.5KG"},{"discount_price":"20.00","number":"1.00","options_name":"5KG"}]}],"total_count":5,"type_count":2},"is_success":true,"total_price":"166.00"}
     * message :
     */

    private int action_time;
    private String code;
    private DataBean data;
    private String message;

    public int getAction_time() {
        return action_time;
    }

    public void setAction_time(int action_time) {
        this.action_time = action_time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * client : {"account_name":"","address":[{"address":"四川省 成都市 武侯区 巴特耐尔家庭服务(天府五街服务点)","address_detail":"哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈","address_id":"758","city_id":"28","consignee":"古胖胖开发专用","contact":"郑帅","is_default":"T","phone":"15122222222"}],"bank":"","bank_account":"","invoice_title":"","taxpayer_number":""}
         * common_set : {"added_tax_invoice":"T","added_tax_invoice_point":7,"plain_invoice":"T","plain_invoice_point":5}
         * delivery : ["上门自取","货运","快递","送货上门","其他"]
         * goods : {"list":[{"base_units":"个","goods_id":"4302","goods_name":"（多规格）有库存，停售","goods_picture":"","is_multi":1,"option_data":[{"discount_price":"22.00","number":"1.00","options_name":"8英寸导航内置流动测速一体机"},{"discount_price":"32.00","number":"2.00","options_name":"32G+降压线+安全锤"}]},{"base_units":"千克","goods_id":"4297","goods_name":"恒都 羔羊后腿 2kg/袋（多规格）","goods_picture":"","is_multi":1,"option_data":[{"discount_price":"20.00","number":"1.00","options_name":"1KG"},{"discount_price":"20.00","number":"2.00","options_name":"2.5KG"},{"discount_price":"20.00","number":"1.00","options_name":"5KG"}]}],"total_count":5,"type_count":2}
         * is_success : true
         * total_price : 166.00
         */

        private ClientBean client;
        private CommonSetBean common_set;
        private GoodsBean goods;
        private boolean is_success;
        private String total_price;
        private List<String> delivery;

        public ClientBean getClient() {
            return client;
        }

        public void setClient(ClientBean client) {
            this.client = client;
        }

        public CommonSetBean getCommon_set() {
            return common_set;
        }

        public void setCommon_set(CommonSetBean common_set) {
            this.common_set = common_set;
        }

        public GoodsBean getGoods() {
            return goods;
        }

        public void setGoods(GoodsBean goods) {
            this.goods = goods;
        }

        public boolean isIs_success() {
            return is_success;
        }

        public void setIs_success(boolean is_success) {
            this.is_success = is_success;
        }

        public String getTotal_price() {
            return total_price;
        }

        public void setTotal_price(String total_price) {
            this.total_price = total_price;
        }

        public List<String> getDelivery() {
            return delivery;
        }

        public void setDelivery(List<String> delivery) {
            this.delivery = delivery;
        }

        public static class ClientBean {
            /**
             * account_name :
             * address : [{"address":"四川省 成都市 武侯区 巴特耐尔家庭服务(天府五街服务点)","address_detail":"哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈","address_id":"758","city_id":"28","consignee":"古胖胖开发专用","contact":"郑帅","is_default":"T","phone":"15122222222"}]
             * bank :
             * bank_account :
             * invoice_title :
             * taxpayer_number :
             */

            private String account_name;
            private String bank;
            private String bank_account;
            private String invoice_title;
            private String taxpayer_number;
            private List<AddressBean> address;

            public String getAccount_name() {
                return account_name;
            }

            public void setAccount_name(String account_name) {
                this.account_name = account_name;
            }

            public String getBank() {
                return bank;
            }

            public void setBank(String bank) {
                this.bank = bank;
            }

            public String getBank_account() {
                return bank_account;
            }

            public void setBank_account(String bank_account) {
                this.bank_account = bank_account;
            }

            public String getInvoice_title() {
                return invoice_title;
            }

            public void setInvoice_title(String invoice_title) {
                this.invoice_title = invoice_title;
            }

            public String getTaxpayer_number() {
                return taxpayer_number;
            }

            public void setTaxpayer_number(String taxpayer_number) {
                this.taxpayer_number = taxpayer_number;
            }

            public List<AddressBean> getAddress() {
                return address;
            }

            public void setAddress(List<AddressBean> address) {
                this.address = address;
            }

            public static class AddressBean {
                /**
                 * address : 四川省 成都市 武侯区 巴特耐尔家庭服务(天府五街服务点)
                 * address_detail : 哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
                 * address_id : 758
                 * city_id : 28
                 * consignee : 古胖胖开发专用
                 * contact : 郑帅
                 * is_default : T
                 * phone : 15122222222
                 */

                private String address;
                private String address_detail;
                private String address_id;
                private String city_id;
                private String consignee;
                private String contact;
                private String is_default;
                private String phone;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getAddress_detail() {
                    return address_detail;
                }

                public void setAddress_detail(String address_detail) {
                    this.address_detail = address_detail;
                }

                public String getAddress_id() {
                    return address_id;
                }

                public void setAddress_id(String address_id) {
                    this.address_id = address_id;
                }

                public String getCity_id() {
                    return city_id;
                }

                public void setCity_id(String city_id) {
                    this.city_id = city_id;
                }

                public String getConsignee() {
                    return consignee;
                }

                public void setConsignee(String consignee) {
                    this.consignee = consignee;
                }

                public String getContact() {
                    return contact;
                }

                public void setContact(String contact) {
                    this.contact = contact;
                }

                public String getIs_default() {
                    return is_default;
                }

                public void setIs_default(String is_default) {
                    this.is_default = is_default;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }
            }
        }

        public static class CommonSetBean {
            /**
             * added_tax_invoice : T
             * added_tax_invoice_point : 7
             * plain_invoice : T
             * plain_invoice_point : 5
             */

            private String added_tax_invoice;
            private int added_tax_invoice_point;
            private String plain_invoice;
            private int plain_invoice_point;

            public String getAdded_tax_invoice() {
                return added_tax_invoice;
            }

            public void setAdded_tax_invoice(String added_tax_invoice) {
                this.added_tax_invoice = added_tax_invoice;
            }

            public int getAdded_tax_invoice_point() {
                return added_tax_invoice_point;
            }

            public void setAdded_tax_invoice_point(int added_tax_invoice_point) {
                this.added_tax_invoice_point = added_tax_invoice_point;
            }

            public String getPlain_invoice() {
                return plain_invoice;
            }

            public void setPlain_invoice(String plain_invoice) {
                this.plain_invoice = plain_invoice;
            }

            public int getPlain_invoice_point() {
                return plain_invoice_point;
            }

            public void setPlain_invoice_point(int plain_invoice_point) {
                this.plain_invoice_point = plain_invoice_point;
            }
        }

        public static class GoodsBean {
            /**
             * list : [{"base_units":"个","goods_id":"4302","goods_name":"（多规格）有库存，停售","goods_picture":"","is_multi":1,"option_data":[{"discount_price":"22.00","number":"1.00","options_name":"8英寸导航内置流动测速一体机"},{"discount_price":"32.00","number":"2.00","options_name":"32G+降压线+安全锤"}]},{"base_units":"千克","goods_id":"4297","goods_name":"恒都 羔羊后腿 2kg/袋（多规格）","goods_picture":"","is_multi":1,"option_data":[{"discount_price":"20.00","number":"1.00","options_name":"1KG"},{"discount_price":"20.00","number":"2.00","options_name":"2.5KG"},{"discount_price":"20.00","number":"1.00","options_name":"5KG"}]}]
             * total_count : 5
             * type_count : 2
             */

            private int total_count;
            private int type_count;
            private List<ListBean> list;

            public int getTotal_count() {
                return total_count;
            }

            public void setTotal_count(int total_count) {
                this.total_count = total_count;
            }

            public int getType_count() {
                return type_count;
            }

            public void setType_count(int type_count) {
                this.type_count = type_count;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                /**
                 * base_units : 个
                 * goods_id : 4302
                 * goods_name : （多规格）有库存，停售
                 * goods_picture :
                 * is_multi : 1
                 * option_data : [{"discount_price":"22.00","number":"1.00","options_name":"8英寸导航内置流动测速一体机"},{"discount_price":"32.00","number":"2.00","options_name":"32G+降压线+安全锤"}]
                 */

                private String base_units;
                private String goods_id;
                private String goods_name;
                private String goods_picture;
                private int is_multi;
                private List<OptionDataBean> option_data;

                public String getBase_units() {
                    return base_units;
                }

                public void setBase_units(String base_units) {
                    this.base_units = base_units;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public String getGoods_picture() {
                    return goods_picture;
                }

                public void setGoods_picture(String goods_picture) {
                    this.goods_picture = goods_picture;
                }

                public int getIs_multi() {
                    return is_multi;
                }

                public void setIs_multi(int is_multi) {
                    this.is_multi = is_multi;
                }

                public List<OptionDataBean> getOption_data() {
                    return option_data;
                }

                public void setOption_data(List<OptionDataBean> option_data) {
                    this.option_data = option_data;
                }

                public static class OptionDataBean {
                    /**
                     * discount_price : 22.00
                     * number : 1.00
                     * options_name : 8英寸导航内置流动测速一体机
                     */

                    private String discount_price;
                    private String number;
                    private String options_name;

                    public String getDiscount_price() {
                        return discount_price;
                    }

                    public void setDiscount_price(String discount_price) {
                        this.discount_price = discount_price;
                    }

                    public String getNumber() {
                        return number;
                    }

                    public void setNumber(String number) {
                        this.number = number;
                    }

                    public String getOptions_name() {
                        return options_name;
                    }

                    public void setOptions_name(String options_name) {
                        this.options_name = options_name;
                    }
                }
            }
        }
    }
}