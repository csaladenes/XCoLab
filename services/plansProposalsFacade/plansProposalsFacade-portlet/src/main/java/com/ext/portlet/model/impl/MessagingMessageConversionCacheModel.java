package com.ext.portlet.model.impl;

import com.ext.portlet.model.MessagingMessageConversion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MessagingMessageConversion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see MessagingMessageConversion
 * @generated
 */
public class MessagingMessageConversionCacheModel implements CacheModel<MessagingMessageConversion>,
    Externalizable {
    public long conversionId;
    public long conversionTypeId;
    public long messageId;
    public String ipAddress;
    public String extraData;
    public String extraData2;
    public long createDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{conversionId=");
        sb.append(conversionId);
        sb.append(", conversionTypeId=");
        sb.append(conversionTypeId);
        sb.append(", messageId=");
        sb.append(messageId);
        sb.append(", ipAddress=");
        sb.append(ipAddress);
        sb.append(", extraData=");
        sb.append(extraData);
        sb.append(", extraData2=");
        sb.append(extraData2);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public MessagingMessageConversion toEntityModel() {
        MessagingMessageConversionImpl messagingMessageConversionImpl = new MessagingMessageConversionImpl();

        messagingMessageConversionImpl.setConversionId(conversionId);
        messagingMessageConversionImpl.setConversionTypeId(conversionTypeId);
        messagingMessageConversionImpl.setMessageId(messageId);

        if (ipAddress == null) {
            messagingMessageConversionImpl.setIpAddress(StringPool.BLANK);
        } else {
            messagingMessageConversionImpl.setIpAddress(ipAddress);
        }

        if (extraData == null) {
            messagingMessageConversionImpl.setExtraData(StringPool.BLANK);
        } else {
            messagingMessageConversionImpl.setExtraData(extraData);
        }

        if (extraData2 == null) {
            messagingMessageConversionImpl.setExtraData2(StringPool.BLANK);
        } else {
            messagingMessageConversionImpl.setExtraData2(extraData2);
        }

        if (createDate == Long.MIN_VALUE) {
            messagingMessageConversionImpl.setCreateDate(null);
        } else {
            messagingMessageConversionImpl.setCreateDate(new Date(createDate));
        }

        messagingMessageConversionImpl.resetOriginalValues();

        return messagingMessageConversionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        conversionId = objectInput.readLong();
        conversionTypeId = objectInput.readLong();
        messageId = objectInput.readLong();
        ipAddress = objectInput.readUTF();
        extraData = objectInput.readUTF();
        extraData2 = objectInput.readUTF();
        createDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(conversionId);
        objectOutput.writeLong(conversionTypeId);
        objectOutput.writeLong(messageId);

        if (ipAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ipAddress);
        }

        if (extraData == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(extraData);
        }

        if (extraData2 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(extraData2);
        }

        objectOutput.writeLong(createDate);
    }
}
