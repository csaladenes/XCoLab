package com.ext.portlet.service.persistence;

import com.ext.portlet.NoSuchBalloonTextException;
import com.ext.portlet.model.BalloonText;
import com.ext.portlet.model.impl.BalloonTextImpl;
import com.ext.portlet.model.impl.BalloonTextModelImpl;
import com.ext.portlet.service.persistence.BalloonTextPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the balloon text service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalloonTextPersistence
 * @see BalloonTextUtil
 * @generated
 */
public class BalloonTextPersistenceImpl extends BasePersistenceImpl<BalloonText>
    implements BalloonTextPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BalloonTextUtil} to access the balloon text persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BalloonTextImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextModelImpl.FINDER_CACHE_ENABLED, BalloonTextImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextModelImpl.FINDER_CACHE_ENABLED, BalloonTextImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ENABLED = new FinderPath(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextModelImpl.FINDER_CACHE_ENABLED, BalloonTextImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEnabled",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENABLED =
        new FinderPath(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextModelImpl.FINDER_CACHE_ENABLED, BalloonTextImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEnabled",
            new String[] { Boolean.class.getName() },
            BalloonTextModelImpl.ENABLED_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ENABLED = new FinderPath(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEnabled",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ENABLED_ENABLED_2 = "balloonText.enabled = ?";
    private static final String _SQL_SELECT_BALLOONTEXT = "SELECT balloonText FROM BalloonText balloonText";
    private static final String _SQL_SELECT_BALLOONTEXT_WHERE = "SELECT balloonText FROM BalloonText balloonText WHERE ";
    private static final String _SQL_COUNT_BALLOONTEXT = "SELECT COUNT(balloonText) FROM BalloonText balloonText";
    private static final String _SQL_COUNT_BALLOONTEXT_WHERE = "SELECT COUNT(balloonText) FROM BalloonText balloonText WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "balloonText.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BalloonText exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BalloonText exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BalloonTextPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static BalloonText _nullBalloonText = new BalloonTextImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BalloonText> toCacheModel() {
                return _nullBalloonTextCacheModel;
            }
        };

    private static CacheModel<BalloonText> _nullBalloonTextCacheModel = new CacheModel<BalloonText>() {
            @Override
            public BalloonText toEntityModel() {
                return _nullBalloonText;
            }
        };

    public BalloonTextPersistenceImpl() {
        setModelClass(BalloonText.class);
    }

    /**
     * Returns all the balloon texts where enabled = &#63;.
     *
     * @param enabled the enabled
     * @return the matching balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BalloonText> findByEnabled(boolean enabled)
        throws SystemException {
        return findByEnabled(enabled, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the balloon texts where enabled = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonTextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param enabled the enabled
     * @param start the lower bound of the range of balloon texts
     * @param end the upper bound of the range of balloon texts (not inclusive)
     * @return the range of matching balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BalloonText> findByEnabled(boolean enabled, int start, int end)
        throws SystemException {
        return findByEnabled(enabled, start, end, null);
    }

    /**
     * Returns an ordered range of all the balloon texts where enabled = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonTextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param enabled the enabled
     * @param start the lower bound of the range of balloon texts
     * @param end the upper bound of the range of balloon texts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BalloonText> findByEnabled(boolean enabled, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENABLED;
            finderArgs = new Object[] { enabled };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ENABLED;
            finderArgs = new Object[] { enabled, start, end, orderByComparator };
        }

        List<BalloonText> list = (List<BalloonText>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BalloonText balloonText : list) {
                if ((enabled != balloonText.getEnabled())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BALLOONTEXT_WHERE);

            query.append(_FINDER_COLUMN_ENABLED_ENABLED_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BalloonTextModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(enabled);

                if (!pagination) {
                    list = (List<BalloonText>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BalloonText>(list);
                } else {
                    list = (List<BalloonText>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first balloon text in the ordered set where enabled = &#63;.
     *
     * @param enabled the enabled
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching balloon text
     * @throws com.ext.portlet.NoSuchBalloonTextException if a matching balloon text could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText findByEnabled_First(boolean enabled,
        OrderByComparator orderByComparator)
        throws NoSuchBalloonTextException, SystemException {
        BalloonText balloonText = fetchByEnabled_First(enabled,
                orderByComparator);

        if (balloonText != null) {
            return balloonText;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("enabled=");
        msg.append(enabled);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBalloonTextException(msg.toString());
    }

    /**
     * Returns the first balloon text in the ordered set where enabled = &#63;.
     *
     * @param enabled the enabled
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching balloon text, or <code>null</code> if a matching balloon text could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText fetchByEnabled_First(boolean enabled,
        OrderByComparator orderByComparator) throws SystemException {
        List<BalloonText> list = findByEnabled(enabled, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last balloon text in the ordered set where enabled = &#63;.
     *
     * @param enabled the enabled
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching balloon text
     * @throws com.ext.portlet.NoSuchBalloonTextException if a matching balloon text could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText findByEnabled_Last(boolean enabled,
        OrderByComparator orderByComparator)
        throws NoSuchBalloonTextException, SystemException {
        BalloonText balloonText = fetchByEnabled_Last(enabled, orderByComparator);

        if (balloonText != null) {
            return balloonText;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("enabled=");
        msg.append(enabled);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBalloonTextException(msg.toString());
    }

    /**
     * Returns the last balloon text in the ordered set where enabled = &#63;.
     *
     * @param enabled the enabled
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching balloon text, or <code>null</code> if a matching balloon text could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText fetchByEnabled_Last(boolean enabled,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByEnabled(enabled);

        if (count == 0) {
            return null;
        }

        List<BalloonText> list = findByEnabled(enabled, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the balloon texts before and after the current balloon text in the ordered set where enabled = &#63;.
     *
     * @param id the primary key of the current balloon text
     * @param enabled the enabled
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next balloon text
     * @throws com.ext.portlet.NoSuchBalloonTextException if a balloon text with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText[] findByEnabled_PrevAndNext(long id, boolean enabled,
        OrderByComparator orderByComparator)
        throws NoSuchBalloonTextException, SystemException {
        BalloonText balloonText = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            BalloonText[] array = new BalloonTextImpl[3];

            array[0] = getByEnabled_PrevAndNext(session, balloonText, enabled,
                    orderByComparator, true);

            array[1] = balloonText;

            array[2] = getByEnabled_PrevAndNext(session, balloonText, enabled,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BalloonText getByEnabled_PrevAndNext(Session session,
        BalloonText balloonText, boolean enabled,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BALLOONTEXT_WHERE);

        query.append(_FINDER_COLUMN_ENABLED_ENABLED_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BalloonTextModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(enabled);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(balloonText);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BalloonText> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the balloon texts where enabled = &#63; from the database.
     *
     * @param enabled the enabled
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByEnabled(boolean enabled) throws SystemException {
        for (BalloonText balloonText : findByEnabled(enabled,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(balloonText);
        }
    }

    /**
     * Returns the number of balloon texts where enabled = &#63;.
     *
     * @param enabled the enabled
     * @return the number of matching balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByEnabled(boolean enabled) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ENABLED;

        Object[] finderArgs = new Object[] { enabled };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BALLOONTEXT_WHERE);

            query.append(_FINDER_COLUMN_ENABLED_ENABLED_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(enabled);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the balloon text in the entity cache if it is enabled.
     *
     * @param balloonText the balloon text
     */
    @Override
    public void cacheResult(BalloonText balloonText) {
        EntityCacheUtil.putResult(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextImpl.class, balloonText.getPrimaryKey(), balloonText);

        balloonText.resetOriginalValues();
    }

    /**
     * Caches the balloon texts in the entity cache if it is enabled.
     *
     * @param balloonTexts the balloon texts
     */
    @Override
    public void cacheResult(List<BalloonText> balloonTexts) {
        for (BalloonText balloonText : balloonTexts) {
            if (EntityCacheUtil.getResult(
                        BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
                        BalloonTextImpl.class, balloonText.getPrimaryKey()) == null) {
                cacheResult(balloonText);
            } else {
                balloonText.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all balloon texts.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BalloonTextImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BalloonTextImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the balloon text.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BalloonText balloonText) {
        EntityCacheUtil.removeResult(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextImpl.class, balloonText.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BalloonText> balloonTexts) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BalloonText balloonText : balloonTexts) {
            EntityCacheUtil.removeResult(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
                BalloonTextImpl.class, balloonText.getPrimaryKey());
        }
    }

    /**
     * Creates a new balloon text with the primary key. Does not add the balloon text to the database.
     *
     * @param id the primary key for the new balloon text
     * @return the new balloon text
     */
    @Override
    public BalloonText create(long id) {
        BalloonText balloonText = new BalloonTextImpl();

        balloonText.setNew(true);
        balloonText.setPrimaryKey(id);

        return balloonText;
    }

    /**
     * Removes the balloon text with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the balloon text
     * @return the balloon text that was removed
     * @throws com.ext.portlet.NoSuchBalloonTextException if a balloon text with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText remove(long id)
        throws NoSuchBalloonTextException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the balloon text with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the balloon text
     * @return the balloon text that was removed
     * @throws com.ext.portlet.NoSuchBalloonTextException if a balloon text with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText remove(Serializable primaryKey)
        throws NoSuchBalloonTextException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BalloonText balloonText = (BalloonText) session.get(BalloonTextImpl.class,
                    primaryKey);

            if (balloonText == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBalloonTextException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(balloonText);
        } catch (NoSuchBalloonTextException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BalloonText removeImpl(BalloonText balloonText)
        throws SystemException {
        balloonText = toUnwrappedModel(balloonText);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(balloonText)) {
                balloonText = (BalloonText) session.get(BalloonTextImpl.class,
                        balloonText.getPrimaryKeyObj());
            }

            if (balloonText != null) {
                session.delete(balloonText);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (balloonText != null) {
            clearCache(balloonText);
        }

        return balloonText;
    }

    @Override
    public BalloonText updateImpl(com.ext.portlet.model.BalloonText balloonText)
        throws SystemException {
        balloonText = toUnwrappedModel(balloonText);

        boolean isNew = balloonText.isNew();

        BalloonTextModelImpl balloonTextModelImpl = (BalloonTextModelImpl) balloonText;

        Session session = null;

        try {
            session = openSession();

            if (balloonText.isNew()) {
                session.save(balloonText);

                balloonText.setNew(false);
            } else {
                session.merge(balloonText);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BalloonTextModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((balloonTextModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENABLED.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        balloonTextModelImpl.getOriginalEnabled()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENABLED, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENABLED,
                    args);

                args = new Object[] { balloonTextModelImpl.getEnabled() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENABLED, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENABLED,
                    args);
            }
        }

        EntityCacheUtil.putResult(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
            BalloonTextImpl.class, balloonText.getPrimaryKey(), balloonText);

        return balloonText;
    }

    protected BalloonText toUnwrappedModel(BalloonText balloonText) {
        if (balloonText instanceof BalloonTextImpl) {
            return balloonText;
        }

        BalloonTextImpl balloonTextImpl = new BalloonTextImpl();

        balloonTextImpl.setNew(balloonText.isNew());
        balloonTextImpl.setPrimaryKey(balloonText.getPrimaryKey());

        balloonTextImpl.setId(balloonText.getId());
        balloonTextImpl.setName(balloonText.getName());
        balloonTextImpl.setTextBeforeForm(balloonText.getTextBeforeForm());
        balloonTextImpl.setTextAfterForm(balloonText.getTextAfterForm());
        balloonTextImpl.setTextBeforeShareButtons(balloonText.getTextBeforeShareButtons());
        balloonTextImpl.setTextAfterShareButtons(balloonText.getTextAfterShareButtons());
        balloonTextImpl.setAcceptTosText(balloonText.getAcceptTosText());
        balloonTextImpl.setEmailTemplate(balloonText.getEmailTemplate());
        balloonTextImpl.setEmailSubjectTemplate(balloonText.getEmailSubjectTemplate());
        balloonTextImpl.setTwitterDescription(balloonText.getTwitterDescription());
        balloonTextImpl.setTwitterSubject(balloonText.getTwitterSubject());
        balloonTextImpl.setFacebookDescription(balloonText.getFacebookDescription());
        balloonTextImpl.setFacebookSubject(balloonText.getFacebookSubject());
        balloonTextImpl.setEnabled(balloonText.isEnabled());

        return balloonTextImpl;
    }

    /**
     * Returns the balloon text with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the balloon text
     * @return the balloon text
     * @throws com.ext.portlet.NoSuchBalloonTextException if a balloon text with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBalloonTextException, SystemException {
        BalloonText balloonText = fetchByPrimaryKey(primaryKey);

        if (balloonText == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBalloonTextException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return balloonText;
    }

    /**
     * Returns the balloon text with the primary key or throws a {@link com.ext.portlet.NoSuchBalloonTextException} if it could not be found.
     *
     * @param id the primary key of the balloon text
     * @return the balloon text
     * @throws com.ext.portlet.NoSuchBalloonTextException if a balloon text with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText findByPrimaryKey(long id)
        throws NoSuchBalloonTextException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the balloon text with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the balloon text
     * @return the balloon text, or <code>null</code> if a balloon text with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BalloonText balloonText = (BalloonText) EntityCacheUtil.getResult(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
                BalloonTextImpl.class, primaryKey);

        if (balloonText == _nullBalloonText) {
            return null;
        }

        if (balloonText == null) {
            Session session = null;

            try {
                session = openSession();

                balloonText = (BalloonText) session.get(BalloonTextImpl.class,
                        primaryKey);

                if (balloonText != null) {
                    cacheResult(balloonText);
                } else {
                    EntityCacheUtil.putResult(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
                        BalloonTextImpl.class, primaryKey, _nullBalloonText);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BalloonTextModelImpl.ENTITY_CACHE_ENABLED,
                    BalloonTextImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return balloonText;
    }

    /**
     * Returns the balloon text with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the balloon text
     * @return the balloon text, or <code>null</code> if a balloon text with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BalloonText fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the balloon texts.
     *
     * @return the balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BalloonText> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the balloon texts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonTextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of balloon texts
     * @param end the upper bound of the range of balloon texts (not inclusive)
     * @return the range of balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BalloonText> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the balloon texts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonTextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of balloon texts
     * @param end the upper bound of the range of balloon texts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BalloonText> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<BalloonText> list = (List<BalloonText>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BALLOONTEXT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BALLOONTEXT;

                if (pagination) {
                    sql = sql.concat(BalloonTextModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BalloonText>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BalloonText>(list);
                } else {
                    list = (List<BalloonText>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the balloon texts from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BalloonText balloonText : findAll()) {
            remove(balloonText);
        }
    }

    /**
     * Returns the number of balloon texts.
     *
     * @return the number of balloon texts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_BALLOONTEXT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the balloon text persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.model.BalloonText")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BalloonText>> listenersList = new ArrayList<ModelListener<BalloonText>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BalloonText>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BalloonTextImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
