package com.zonni.orgs.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.zonni.orgs.database.converter.Converters;
import com.zonni.orgs.modelo.Product;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDAO_Impl implements ProductDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Product> __insertionAdapterOfProduct;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<Product> __insertionAdapterOfProduct_1;

  private final EntityDeletionOrUpdateAdapter<Product> __deletionAdapterOfProduct;

  private final EntityDeletionOrUpdateAdapter<Product> __updateAdapterOfProduct;

  private final SharedSQLiteStatement __preparedStmtOfRemoveWithId;

  public ProductDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProduct = new EntityInsertionAdapter<Product>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Product` (`id`,`nome`,`descriptor`,`urlThumb`,`price`,`userId`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Product entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNome() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNome());
        }
        if (entity.getDescriptor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescriptor());
        }
        if (entity.getUrlThumb() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getUrlThumb());
        }
        final Double _tmp = __converters.bigDecimalToDouble(entity.getPrice());
        if (_tmp == null) {
          statement.bindNull(5);
        } else {
          statement.bindDouble(5, _tmp);
        }
        if (entity.getUserId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getUserId());
        }
      }
    };
    this.__insertionAdapterOfProduct_1 = new EntityInsertionAdapter<Product>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Product` (`id`,`nome`,`descriptor`,`urlThumb`,`price`,`userId`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Product entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNome() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNome());
        }
        if (entity.getDescriptor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescriptor());
        }
        if (entity.getUrlThumb() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getUrlThumb());
        }
        final Double _tmp = __converters.bigDecimalToDouble(entity.getPrice());
        if (_tmp == null) {
          statement.bindNull(5);
        } else {
          statement.bindDouble(5, _tmp);
        }
        if (entity.getUserId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getUserId());
        }
      }
    };
    this.__deletionAdapterOfProduct = new EntityDeletionOrUpdateAdapter<Product>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Product` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Product entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfProduct = new EntityDeletionOrUpdateAdapter<Product>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `Product` SET `id` = ?,`nome` = ?,`descriptor` = ?,`urlThumb` = ?,`price` = ?,`userId` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Product entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNome() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNome());
        }
        if (entity.getDescriptor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescriptor());
        }
        if (entity.getUrlThumb() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getUrlThumb());
        }
        final Double _tmp = __converters.bigDecimalToDouble(entity.getPrice());
        if (_tmp == null) {
          statement.bindNull(5);
        } else {
          statement.bindDouble(5, _tmp);
        }
        if (entity.getUserId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getUserId());
        }
        statement.bindLong(7, entity.getId());
      }
    };
    this.__preparedStmtOfRemoveWithId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Product WHERE id =?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Product product, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProduct.insert(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final Product[] products, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProduct_1.insert(products);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object remove(final Product[] products, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProduct.handleMultiple(products);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final Product[] product, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfProduct.handleMultiple(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object removeWithId(final long id, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveWithId.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfRemoveWithId.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Product>> searchAll() {
    final String _sql = "SELECT * FROM Product";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Product>> searchAllOfUser(final String userId) {
    final String _sql = "SELECT * FROM Product WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object searchWithId(final long id, final Continuation<? super Product> $completion) {
    final String _sql = "SELECT * FROM Product WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Product>() {
      @Override
      @NonNull
      public Product call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final Product _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _result = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Product>> searchOrdNameAsc(final String userId) {
    final String _sql = "SELECT * FROM Product WHERE userId = ? ORDER BY nome ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Product>> searchOrdNameDesc(final String userId) {
    final String _sql = "SELECT * FROM Product WHERE userId = ? ORDER BY nome DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Product>> searchOrdDescriptionAsc(final String userId) {
    final String _sql = "SELECT * FROM Product WHERE userId = ? ORDER BY descriptor ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Product>> searchOrdDescriptionDesc(final String userId) {
    final String _sql = "SELECT * FROM Product WHERE userId = ? ORDER BY descriptor DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Product>> searchOrdPriceAsc(final String userId) {
    final String _sql = "SELECT * FROM Product WHERE userId = ? ORDER BY price ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Product>> searchOrdPriceDesc(final String userId) {
    final String _sql = "SELECT * FROM Product WHERE userId = ? ORDER BY price DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Product"}, new Callable<List<Product>>() {
      @Override
      @NonNull
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescriptor = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptor");
          final int _cursorIndexOfUrlThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "urlThumb");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Product _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescriptor;
            if (_cursor.isNull(_cursorIndexOfDescriptor)) {
              _tmpDescriptor = null;
            } else {
              _tmpDescriptor = _cursor.getString(_cursorIndexOfDescriptor);
            }
            final String _tmpUrlThumb;
            if (_cursor.isNull(_cursorIndexOfUrlThumb)) {
              _tmpUrlThumb = null;
            } else {
              _tmpUrlThumb = _cursor.getString(_cursorIndexOfUrlThumb);
            }
            final BigDecimal _tmpPrice;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfPrice);
            }
            _tmpPrice = __converters.deDouble(_tmp);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item = new Product(_tmpId,_tmpNome,_tmpDescriptor,_tmpUrlThumb,_tmpPrice,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
