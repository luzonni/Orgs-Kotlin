// Generated by view binder compiler. Do not edit!
package com.zonni.orgs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.zonni.orgs.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFormProductBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button activityFormProductSaveButton;

  @NonNull
  public final ImageView activityFormProductThumb;

  @NonNull
  public final AutoCompleteTextView activityFormProductUserId;

  @NonNull
  public final TextInputEditText formProductInputConteudo;

  @NonNull
  public final TextInputEditText formProductInputNome;

  @NonNull
  public final TextInputEditText formProductInputValor;

  @NonNull
  public final TextInputLayout formProductTextfieldConteudo;

  @NonNull
  public final TextInputLayout formProductTextfieldNome;

  @NonNull
  public final TextInputLayout formProductTextfieldValor;

  private ActivityFormProductBinding(@NonNull ScrollView rootView,
      @NonNull Button activityFormProductSaveButton, @NonNull ImageView activityFormProductThumb,
      @NonNull AutoCompleteTextView activityFormProductUserId,
      @NonNull TextInputEditText formProductInputConteudo,
      @NonNull TextInputEditText formProductInputNome,
      @NonNull TextInputEditText formProductInputValor,
      @NonNull TextInputLayout formProductTextfieldConteudo,
      @NonNull TextInputLayout formProductTextfieldNome,
      @NonNull TextInputLayout formProductTextfieldValor) {
    this.rootView = rootView;
    this.activityFormProductSaveButton = activityFormProductSaveButton;
    this.activityFormProductThumb = activityFormProductThumb;
    this.activityFormProductUserId = activityFormProductUserId;
    this.formProductInputConteudo = formProductInputConteudo;
    this.formProductInputNome = formProductInputNome;
    this.formProductInputValor = formProductInputValor;
    this.formProductTextfieldConteudo = formProductTextfieldConteudo;
    this.formProductTextfieldNome = formProductTextfieldNome;
    this.formProductTextfieldValor = formProductTextfieldValor;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFormProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFormProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_form_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFormProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_form_product_save_button;
      Button activityFormProductSaveButton = ViewBindings.findChildViewById(rootView, id);
      if (activityFormProductSaveButton == null) {
        break missingId;
      }

      id = R.id.activity_form_product_thumb;
      ImageView activityFormProductThumb = ViewBindings.findChildViewById(rootView, id);
      if (activityFormProductThumb == null) {
        break missingId;
      }

      id = R.id.activity_form_product_user_id;
      AutoCompleteTextView activityFormProductUserId = ViewBindings.findChildViewById(rootView, id);
      if (activityFormProductUserId == null) {
        break missingId;
      }

      id = R.id.form_product_input_conteudo;
      TextInputEditText formProductInputConteudo = ViewBindings.findChildViewById(rootView, id);
      if (formProductInputConteudo == null) {
        break missingId;
      }

      id = R.id.form_product_input_nome;
      TextInputEditText formProductInputNome = ViewBindings.findChildViewById(rootView, id);
      if (formProductInputNome == null) {
        break missingId;
      }

      id = R.id.form_product_input_valor;
      TextInputEditText formProductInputValor = ViewBindings.findChildViewById(rootView, id);
      if (formProductInputValor == null) {
        break missingId;
      }

      id = R.id.form_product_textfield_conteudo;
      TextInputLayout formProductTextfieldConteudo = ViewBindings.findChildViewById(rootView, id);
      if (formProductTextfieldConteudo == null) {
        break missingId;
      }

      id = R.id.form_product_textfield_nome;
      TextInputLayout formProductTextfieldNome = ViewBindings.findChildViewById(rootView, id);
      if (formProductTextfieldNome == null) {
        break missingId;
      }

      id = R.id.form_product_textfield_valor;
      TextInputLayout formProductTextfieldValor = ViewBindings.findChildViewById(rootView, id);
      if (formProductTextfieldValor == null) {
        break missingId;
      }

      return new ActivityFormProductBinding((ScrollView) rootView, activityFormProductSaveButton,
          activityFormProductThumb, activityFormProductUserId, formProductInputConteudo,
          formProductInputNome, formProductInputValor, formProductTextfieldConteudo,
          formProductTextfieldNome, formProductTextfieldValor);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
