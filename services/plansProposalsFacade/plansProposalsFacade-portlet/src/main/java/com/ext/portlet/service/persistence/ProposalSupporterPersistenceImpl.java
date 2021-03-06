package com.ext.portlet.service.persistence;

import com.ext.portlet.NoSuchProposalSupporterException;
import com.ext.portlet.model.ProposalSupporter;
import com.ext.portlet.model.impl.ProposalSupporterImpl;
import com.ext.portlet.model.impl.ProposalSupporterModelImpl;
import com.ext.portlet.service.persistence.ProposalSupporterPersistence;

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

/**
 * The persistence implementation for the proposal supporter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProposalSupporterPersistence
 * @see ProposalSupporterUtil
 * @generated
 */
public class ProposalSupporterPersistenceImpl extends BasePersistenceImpl<ProposalSupporter>
    implements ProposalSupporterPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ProposalSupporterUtil} to access the proposal supporter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ProposalSupporterImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED,
            ProposalSupporterImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED,
            ProposalSupporterImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROPOSALID =
        new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED,
            ProposalSupporterImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProposalId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROPOSALID =
        new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED,
            ProposalSupporterImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProposalId",
            new String[] { Long.class.getName() },
            ProposalSupporterModelImpl.PROPOSALID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PROPOSALID = new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProposalId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PROPOSALID_PROPOSALID_2 = "proposalSupporter.id.proposalId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED,
            ProposalSupporterImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
        new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED,
            ProposalSupporterImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
            new String[] { Long.class.getName() },
            ProposalSupporterModelImpl.USERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USERID_USERID_2 = "proposalSupporter.id.userId = ?";
    private static final String _SQL_SELECT_PROPOSALSUPPORTER = "SELECT proposalSupporter FROM ProposalSupporter proposalSupporter";
    private static final String _SQL_SELECT_PROPOSALSUPPORTER_WHERE = "SELECT proposalSupporter FROM ProposalSupporter proposalSupporter WHERE ";
    private static final String _SQL_COUNT_PROPOSALSUPPORTER = "SELECT COUNT(proposalSupporter) FROM ProposalSupporter proposalSupporter";
    private static final String _SQL_COUNT_PROPOSALSUPPORTER_WHERE = "SELECT COUNT(proposalSupporter) FROM ProposalSupporter proposalSupporter WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "proposalSupporter.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProposalSupporter exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProposalSupporter exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ProposalSupporterPersistenceImpl.class);
    private static ProposalSupporter _nullProposalSupporter = new ProposalSupporterImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<ProposalSupporter> toCacheModel() {
                return _nullProposalSupporterCacheModel;
            }
        };

    private static CacheModel<ProposalSupporter> _nullProposalSupporterCacheModel =
        new CacheModel<ProposalSupporter>() {
            @Override
            public ProposalSupporter toEntityModel() {
                return _nullProposalSupporter;
            }
        };

    public ProposalSupporterPersistenceImpl() {
        setModelClass(ProposalSupporter.class);
    }

    /**
     * Returns all the proposal supporters where proposalId = &#63;.
     *
     * @param proposalId the proposal ID
     * @return the matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findByProposalId(long proposalId)
        throws SystemException {
        return findByProposalId(proposalId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the proposal supporters where proposalId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalSupporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param proposalId the proposal ID
     * @param start the lower bound of the range of proposal supporters
     * @param end the upper bound of the range of proposal supporters (not inclusive)
     * @return the range of matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findByProposalId(long proposalId, int start,
        int end) throws SystemException {
        return findByProposalId(proposalId, start, end, null);
    }

    /**
     * Returns an ordered range of all the proposal supporters where proposalId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalSupporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param proposalId the proposal ID
     * @param start the lower bound of the range of proposal supporters
     * @param end the upper bound of the range of proposal supporters (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findByProposalId(long proposalId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROPOSALID;
            finderArgs = new Object[] { proposalId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROPOSALID;
            finderArgs = new Object[] { proposalId, start, end, orderByComparator };
        }

        List<ProposalSupporter> list = (List<ProposalSupporter>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (ProposalSupporter proposalSupporter : list) {
                if ((proposalId != proposalSupporter.getProposalId())) {
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

            query.append(_SQL_SELECT_PROPOSALSUPPORTER_WHERE);

            query.append(_FINDER_COLUMN_PROPOSALID_PROPOSALID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProposalSupporterModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(proposalId);

                if (!pagination) {
                    list = (List<ProposalSupporter>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ProposalSupporter>(list);
                } else {
                    list = (List<ProposalSupporter>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first proposal supporter in the ordered set where proposalId = &#63;.
     *
     * @param proposalId the proposal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter findByProposalId_First(long proposalId,
        OrderByComparator orderByComparator)
        throws NoSuchProposalSupporterException, SystemException {
        ProposalSupporter proposalSupporter = fetchByProposalId_First(proposalId,
                orderByComparator);

        if (proposalSupporter != null) {
            return proposalSupporter;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("proposalId=");
        msg.append(proposalId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProposalSupporterException(msg.toString());
    }

    /**
     * Returns the first proposal supporter in the ordered set where proposalId = &#63;.
     *
     * @param proposalId the proposal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching proposal supporter, or <code>null</code> if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter fetchByProposalId_First(long proposalId,
        OrderByComparator orderByComparator) throws SystemException {
        List<ProposalSupporter> list = findByProposalId(proposalId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last proposal supporter in the ordered set where proposalId = &#63;.
     *
     * @param proposalId the proposal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter findByProposalId_Last(long proposalId,
        OrderByComparator orderByComparator)
        throws NoSuchProposalSupporterException, SystemException {
        ProposalSupporter proposalSupporter = fetchByProposalId_Last(proposalId,
                orderByComparator);

        if (proposalSupporter != null) {
            return proposalSupporter;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("proposalId=");
        msg.append(proposalId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProposalSupporterException(msg.toString());
    }

    /**
     * Returns the last proposal supporter in the ordered set where proposalId = &#63;.
     *
     * @param proposalId the proposal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching proposal supporter, or <code>null</code> if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter fetchByProposalId_Last(long proposalId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByProposalId(proposalId);

        if (count == 0) {
            return null;
        }

        List<ProposalSupporter> list = findByProposalId(proposalId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the proposal supporters before and after the current proposal supporter in the ordered set where proposalId = &#63;.
     *
     * @param proposalSupporterPK the primary key of the current proposal supporter
     * @param proposalId the proposal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter[] findByProposalId_PrevAndNext(
        ProposalSupporterPK proposalSupporterPK, long proposalId,
        OrderByComparator orderByComparator)
        throws NoSuchProposalSupporterException, SystemException {
        ProposalSupporter proposalSupporter = findByPrimaryKey(proposalSupporterPK);

        Session session = null;

        try {
            session = openSession();

            ProposalSupporter[] array = new ProposalSupporterImpl[3];

            array[0] = getByProposalId_PrevAndNext(session, proposalSupporter,
                    proposalId, orderByComparator, true);

            array[1] = proposalSupporter;

            array[2] = getByProposalId_PrevAndNext(session, proposalSupporter,
                    proposalId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected ProposalSupporter getByProposalId_PrevAndNext(Session session,
        ProposalSupporter proposalSupporter, long proposalId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PROPOSALSUPPORTER_WHERE);

        query.append(_FINDER_COLUMN_PROPOSALID_PROPOSALID_2);

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
            query.append(ProposalSupporterModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(proposalId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(proposalSupporter);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<ProposalSupporter> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the proposal supporters where proposalId = &#63; from the database.
     *
     * @param proposalId the proposal ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByProposalId(long proposalId) throws SystemException {
        for (ProposalSupporter proposalSupporter : findByProposalId(
                proposalId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(proposalSupporter);
        }
    }

    /**
     * Returns the number of proposal supporters where proposalId = &#63;.
     *
     * @param proposalId the proposal ID
     * @return the number of matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByProposalId(long proposalId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PROPOSALID;

        Object[] finderArgs = new Object[] { proposalId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PROPOSALSUPPORTER_WHERE);

            query.append(_FINDER_COLUMN_PROPOSALID_PROPOSALID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(proposalId);

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
     * Returns all the proposal supporters where userId = &#63;.
     *
     * @param userId the user ID
     * @return the matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findByUserId(long userId)
        throws SystemException {
        return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the proposal supporters where userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalSupporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param start the lower bound of the range of proposal supporters
     * @param end the upper bound of the range of proposal supporters (not inclusive)
     * @return the range of matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findByUserId(long userId, int start, int end)
        throws SystemException {
        return findByUserId(userId, start, end, null);
    }

    /**
     * Returns an ordered range of all the proposal supporters where userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalSupporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param start the lower bound of the range of proposal supporters
     * @param end the upper bound of the range of proposal supporters (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findByUserId(long userId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId, start, end, orderByComparator };
        }

        List<ProposalSupporter> list = (List<ProposalSupporter>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (ProposalSupporter proposalSupporter : list) {
                if ((userId != proposalSupporter.getUserId())) {
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

            query.append(_SQL_SELECT_PROPOSALSUPPORTER_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProposalSupporterModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                if (!pagination) {
                    list = (List<ProposalSupporter>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ProposalSupporter>(list);
                } else {
                    list = (List<ProposalSupporter>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first proposal supporter in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter findByUserId_First(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchProposalSupporterException, SystemException {
        ProposalSupporter proposalSupporter = fetchByUserId_First(userId,
                orderByComparator);

        if (proposalSupporter != null) {
            return proposalSupporter;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProposalSupporterException(msg.toString());
    }

    /**
     * Returns the first proposal supporter in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching proposal supporter, or <code>null</code> if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter fetchByUserId_First(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        List<ProposalSupporter> list = findByUserId(userId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last proposal supporter in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter findByUserId_Last(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchProposalSupporterException, SystemException {
        ProposalSupporter proposalSupporter = fetchByUserId_Last(userId,
                orderByComparator);

        if (proposalSupporter != null) {
            return proposalSupporter;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProposalSupporterException(msg.toString());
    }

    /**
     * Returns the last proposal supporter in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching proposal supporter, or <code>null</code> if a matching proposal supporter could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter fetchByUserId_Last(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUserId(userId);

        if (count == 0) {
            return null;
        }

        List<ProposalSupporter> list = findByUserId(userId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the proposal supporters before and after the current proposal supporter in the ordered set where userId = &#63;.
     *
     * @param proposalSupporterPK the primary key of the current proposal supporter
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter[] findByUserId_PrevAndNext(
        ProposalSupporterPK proposalSupporterPK, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchProposalSupporterException, SystemException {
        ProposalSupporter proposalSupporter = findByPrimaryKey(proposalSupporterPK);

        Session session = null;

        try {
            session = openSession();

            ProposalSupporter[] array = new ProposalSupporterImpl[3];

            array[0] = getByUserId_PrevAndNext(session, proposalSupporter,
                    userId, orderByComparator, true);

            array[1] = proposalSupporter;

            array[2] = getByUserId_PrevAndNext(session, proposalSupporter,
                    userId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected ProposalSupporter getByUserId_PrevAndNext(Session session,
        ProposalSupporter proposalSupporter, long userId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PROPOSALSUPPORTER_WHERE);

        query.append(_FINDER_COLUMN_USERID_USERID_2);

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
            query.append(ProposalSupporterModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(proposalSupporter);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<ProposalSupporter> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the proposal supporters where userId = &#63; from the database.
     *
     * @param userId the user ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUserId(long userId) throws SystemException {
        for (ProposalSupporter proposalSupporter : findByUserId(userId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(proposalSupporter);
        }
    }

    /**
     * Returns the number of proposal supporters where userId = &#63;.
     *
     * @param userId the user ID
     * @return the number of matching proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUserId(long userId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

        Object[] finderArgs = new Object[] { userId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PROPOSALSUPPORTER_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

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
     * Caches the proposal supporter in the entity cache if it is enabled.
     *
     * @param proposalSupporter the proposal supporter
     */
    @Override
    public void cacheResult(ProposalSupporter proposalSupporter) {
        EntityCacheUtil.putResult(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterImpl.class, proposalSupporter.getPrimaryKey(),
            proposalSupporter);

        proposalSupporter.resetOriginalValues();
    }

    /**
     * Caches the proposal supporters in the entity cache if it is enabled.
     *
     * @param proposalSupporters the proposal supporters
     */
    @Override
    public void cacheResult(List<ProposalSupporter> proposalSupporters) {
        for (ProposalSupporter proposalSupporter : proposalSupporters) {
            if (EntityCacheUtil.getResult(
                        ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
                        ProposalSupporterImpl.class,
                        proposalSupporter.getPrimaryKey()) == null) {
                cacheResult(proposalSupporter);
            } else {
                proposalSupporter.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all proposal supporters.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ProposalSupporterImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ProposalSupporterImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the proposal supporter.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(ProposalSupporter proposalSupporter) {
        EntityCacheUtil.removeResult(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterImpl.class, proposalSupporter.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<ProposalSupporter> proposalSupporters) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (ProposalSupporter proposalSupporter : proposalSupporters) {
            EntityCacheUtil.removeResult(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
                ProposalSupporterImpl.class, proposalSupporter.getPrimaryKey());
        }
    }

    /**
     * Creates a new proposal supporter with the primary key. Does not add the proposal supporter to the database.
     *
     * @param proposalSupporterPK the primary key for the new proposal supporter
     * @return the new proposal supporter
     */
    @Override
    public ProposalSupporter create(ProposalSupporterPK proposalSupporterPK) {
        ProposalSupporter proposalSupporter = new ProposalSupporterImpl();

        proposalSupporter.setNew(true);
        proposalSupporter.setPrimaryKey(proposalSupporterPK);

        return proposalSupporter;
    }

    /**
     * Removes the proposal supporter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param proposalSupporterPK the primary key of the proposal supporter
     * @return the proposal supporter that was removed
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter remove(ProposalSupporterPK proposalSupporterPK)
        throws NoSuchProposalSupporterException, SystemException {
        return remove((Serializable) proposalSupporterPK);
    }

    /**
     * Removes the proposal supporter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the proposal supporter
     * @return the proposal supporter that was removed
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter remove(Serializable primaryKey)
        throws NoSuchProposalSupporterException, SystemException {
        Session session = null;

        try {
            session = openSession();

            ProposalSupporter proposalSupporter = (ProposalSupporter) session.get(ProposalSupporterImpl.class,
                    primaryKey);

            if (proposalSupporter == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchProposalSupporterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(proposalSupporter);
        } catch (NoSuchProposalSupporterException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected ProposalSupporter removeImpl(ProposalSupporter proposalSupporter)
        throws SystemException {
        proposalSupporter = toUnwrappedModel(proposalSupporter);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(proposalSupporter)) {
                proposalSupporter = (ProposalSupporter) session.get(ProposalSupporterImpl.class,
                        proposalSupporter.getPrimaryKeyObj());
            }

            if (proposalSupporter != null) {
                session.delete(proposalSupporter);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (proposalSupporter != null) {
            clearCache(proposalSupporter);
        }

        return proposalSupporter;
    }

    @Override
    public ProposalSupporter updateImpl(
        com.ext.portlet.model.ProposalSupporter proposalSupporter)
        throws SystemException {
        proposalSupporter = toUnwrappedModel(proposalSupporter);

        boolean isNew = proposalSupporter.isNew();

        ProposalSupporterModelImpl proposalSupporterModelImpl = (ProposalSupporterModelImpl) proposalSupporter;

        Session session = null;

        try {
            session = openSession();

            if (proposalSupporter.isNew()) {
                session.save(proposalSupporter);

                proposalSupporter.setNew(false);
            } else {
                session.merge(proposalSupporter);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ProposalSupporterModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((proposalSupporterModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROPOSALID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        proposalSupporterModelImpl.getOriginalProposalId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROPOSALID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROPOSALID,
                    args);

                args = new Object[] { proposalSupporterModelImpl.getProposalId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROPOSALID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROPOSALID,
                    args);
            }

            if ((proposalSupporterModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        proposalSupporterModelImpl.getOriginalUserId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);

                args = new Object[] { proposalSupporterModelImpl.getUserId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
            ProposalSupporterImpl.class, proposalSupporter.getPrimaryKey(),
            proposalSupporter);

        return proposalSupporter;
    }

    protected ProposalSupporter toUnwrappedModel(
        ProposalSupporter proposalSupporter) {
        if (proposalSupporter instanceof ProposalSupporterImpl) {
            return proposalSupporter;
        }

        ProposalSupporterImpl proposalSupporterImpl = new ProposalSupporterImpl();

        proposalSupporterImpl.setNew(proposalSupporter.isNew());
        proposalSupporterImpl.setPrimaryKey(proposalSupporter.getPrimaryKey());

        proposalSupporterImpl.setProposalId(proposalSupporter.getProposalId());
        proposalSupporterImpl.setUserId(proposalSupporter.getUserId());
        proposalSupporterImpl.setCreateDate(proposalSupporter.getCreateDate());

        return proposalSupporterImpl;
    }

    /**
     * Returns the proposal supporter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the proposal supporter
     * @return the proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter findByPrimaryKey(Serializable primaryKey)
        throws NoSuchProposalSupporterException, SystemException {
        ProposalSupporter proposalSupporter = fetchByPrimaryKey(primaryKey);

        if (proposalSupporter == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchProposalSupporterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return proposalSupporter;
    }

    /**
     * Returns the proposal supporter with the primary key or throws a {@link com.ext.portlet.NoSuchProposalSupporterException} if it could not be found.
     *
     * @param proposalSupporterPK the primary key of the proposal supporter
     * @return the proposal supporter
     * @throws com.ext.portlet.NoSuchProposalSupporterException if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter findByPrimaryKey(
        ProposalSupporterPK proposalSupporterPK)
        throws NoSuchProposalSupporterException, SystemException {
        return findByPrimaryKey((Serializable) proposalSupporterPK);
    }

    /**
     * Returns the proposal supporter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the proposal supporter
     * @return the proposal supporter, or <code>null</code> if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        ProposalSupporter proposalSupporter = (ProposalSupporter) EntityCacheUtil.getResult(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
                ProposalSupporterImpl.class, primaryKey);

        if (proposalSupporter == _nullProposalSupporter) {
            return null;
        }

        if (proposalSupporter == null) {
            Session session = null;

            try {
                session = openSession();

                proposalSupporter = (ProposalSupporter) session.get(ProposalSupporterImpl.class,
                        primaryKey);

                if (proposalSupporter != null) {
                    cacheResult(proposalSupporter);
                } else {
                    EntityCacheUtil.putResult(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
                        ProposalSupporterImpl.class, primaryKey,
                        _nullProposalSupporter);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ProposalSupporterModelImpl.ENTITY_CACHE_ENABLED,
                    ProposalSupporterImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return proposalSupporter;
    }

    /**
     * Returns the proposal supporter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param proposalSupporterPK the primary key of the proposal supporter
     * @return the proposal supporter, or <code>null</code> if a proposal supporter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ProposalSupporter fetchByPrimaryKey(
        ProposalSupporterPK proposalSupporterPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) proposalSupporterPK);
    }

    /**
     * Returns all the proposal supporters.
     *
     * @return the proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the proposal supporters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalSupporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of proposal supporters
     * @param end the upper bound of the range of proposal supporters (not inclusive)
     * @return the range of proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the proposal supporters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalSupporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of proposal supporters
     * @param end the upper bound of the range of proposal supporters (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of proposal supporters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ProposalSupporter> findAll(int start, int end,
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

        List<ProposalSupporter> list = (List<ProposalSupporter>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PROPOSALSUPPORTER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PROPOSALSUPPORTER;

                if (pagination) {
                    sql = sql.concat(ProposalSupporterModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<ProposalSupporter>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ProposalSupporter>(list);
                } else {
                    list = (List<ProposalSupporter>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the proposal supporters from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (ProposalSupporter proposalSupporter : findAll()) {
            remove(proposalSupporter);
        }
    }

    /**
     * Returns the number of proposal supporters.
     *
     * @return the number of proposal supporters
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

                Query q = session.createQuery(_SQL_COUNT_PROPOSALSUPPORTER);

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

    /**
     * Initializes the proposal supporter persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.model.ProposalSupporter")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<ProposalSupporter>> listenersList = new ArrayList<ModelListener<ProposalSupporter>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<ProposalSupporter>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ProposalSupporterImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
