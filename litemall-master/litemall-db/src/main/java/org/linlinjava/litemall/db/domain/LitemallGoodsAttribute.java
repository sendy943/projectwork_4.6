package org.linlinjava.litemall.db.domain;

public class LitemallGoodsAttribute {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_goods_attribute.id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_goods_attribute.goods_id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_goods_attribute.value
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_goods_attribute.attribute
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private String attribute;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_goods_attribute.id
     *
     * @return the value of litemall_goods_attribute.id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_goods_attribute.id
     *
     * @param id the value for litemall_goods_attribute.id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_goods_attribute.goods_id
     *
     * @return the value of litemall_goods_attribute.goods_id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_goods_attribute.goods_id
     *
     * @param goodsId the value for litemall_goods_attribute.goods_id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_goods_attribute.value
     *
     * @return the value of litemall_goods_attribute.value
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_goods_attribute.value
     *
     * @param value the value for litemall_goods_attribute.value
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_goods_attribute.attribute
     *
     * @return the value of litemall_goods_attribute.attribute
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_goods_attribute.attribute
     *
     * @param attribute the value for litemall_goods_attribute.attribute
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", value=").append(value);
        sb.append(", attribute=").append(attribute);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallGoodsAttribute other = (LitemallGoodsAttribute) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getAttribute() == null ? other.getAttribute() == null : this.getAttribute().equals(other.getAttribute()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        goodsId("goods_id"),
        value("value"),
        attribute("attribute");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_goods_attribute
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_goods_attribute
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_goods_attribute
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_goods_attribute
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_goods_attribute
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_goods_attribute
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}