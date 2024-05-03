// Generated by view binder compiler. Do not edit!
package com.zonni.orgs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zonni.orgs.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListProductsMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton addButton;

  @NonNull
  public final RecyclerView listaProdutos;

  private ListProductsMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton addButton, @NonNull RecyclerView listaProdutos) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.listaProdutos = listaProdutos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListProductsMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListProductsMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_products_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListProductsMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_button;
      FloatingActionButton addButton = ViewBindings.findChildViewById(rootView, id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.lista_produtos;
      RecyclerView listaProdutos = ViewBindings.findChildViewById(rootView, id);
      if (listaProdutos == null) {
        break missingId;
      }

      return new ListProductsMainBinding((ConstraintLayout) rootView, addButton, listaProdutos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
