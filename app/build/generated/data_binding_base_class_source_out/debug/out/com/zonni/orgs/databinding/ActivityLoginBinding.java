// Generated by view binder compiler. Do not edit!
package com.zonni.orgs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button activityLoginBotaoCadastrar;

  @NonNull
  public final Button activityLoginBotaoEntrar;

  @NonNull
  public final ImageView activityLoginImagemLogo;

  @NonNull
  public final TextInputEditText activityLoginSenha;

  @NonNull
  public final TextView activityLoginTitulo;

  @NonNull
  public final TextInputEditText activityLoginUsuario;

  @NonNull
  public final TextInputLayout textInputlayoutSenha;

  @NonNull
  public final TextInputLayout textInputlayoutUsuario;

  private ActivityLoginBinding(@NonNull ScrollView rootView,
      @NonNull Button activityLoginBotaoCadastrar, @NonNull Button activityLoginBotaoEntrar,
      @NonNull ImageView activityLoginImagemLogo, @NonNull TextInputEditText activityLoginSenha,
      @NonNull TextView activityLoginTitulo, @NonNull TextInputEditText activityLoginUsuario,
      @NonNull TextInputLayout textInputlayoutSenha,
      @NonNull TextInputLayout textInputlayoutUsuario) {
    this.rootView = rootView;
    this.activityLoginBotaoCadastrar = activityLoginBotaoCadastrar;
    this.activityLoginBotaoEntrar = activityLoginBotaoEntrar;
    this.activityLoginImagemLogo = activityLoginImagemLogo;
    this.activityLoginSenha = activityLoginSenha;
    this.activityLoginTitulo = activityLoginTitulo;
    this.activityLoginUsuario = activityLoginUsuario;
    this.textInputlayoutSenha = textInputlayoutSenha;
    this.textInputlayoutUsuario = textInputlayoutUsuario;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_login_botao_cadastrar;
      Button activityLoginBotaoCadastrar = ViewBindings.findChildViewById(rootView, id);
      if (activityLoginBotaoCadastrar == null) {
        break missingId;
      }

      id = R.id.activity_login_botao_entrar;
      Button activityLoginBotaoEntrar = ViewBindings.findChildViewById(rootView, id);
      if (activityLoginBotaoEntrar == null) {
        break missingId;
      }

      id = R.id.activity_login_imagem_logo;
      ImageView activityLoginImagemLogo = ViewBindings.findChildViewById(rootView, id);
      if (activityLoginImagemLogo == null) {
        break missingId;
      }

      id = R.id.activity_login_senha;
      TextInputEditText activityLoginSenha = ViewBindings.findChildViewById(rootView, id);
      if (activityLoginSenha == null) {
        break missingId;
      }

      id = R.id.activity_login_titulo;
      TextView activityLoginTitulo = ViewBindings.findChildViewById(rootView, id);
      if (activityLoginTitulo == null) {
        break missingId;
      }

      id = R.id.activity_login_usuario;
      TextInputEditText activityLoginUsuario = ViewBindings.findChildViewById(rootView, id);
      if (activityLoginUsuario == null) {
        break missingId;
      }

      id = R.id.textInputlayout_senha;
      TextInputLayout textInputlayoutSenha = ViewBindings.findChildViewById(rootView, id);
      if (textInputlayoutSenha == null) {
        break missingId;
      }

      id = R.id.textInputlayout_usuario;
      TextInputLayout textInputlayoutUsuario = ViewBindings.findChildViewById(rootView, id);
      if (textInputlayoutUsuario == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ScrollView) rootView, activityLoginBotaoCadastrar,
          activityLoginBotaoEntrar, activityLoginImagemLogo, activityLoginSenha,
          activityLoginTitulo, activityLoginUsuario, textInputlayoutSenha, textInputlayoutUsuario);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
