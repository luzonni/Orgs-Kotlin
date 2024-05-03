// Generated by view binder compiler. Do not edit!
package com.zonni.orgs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityRegisterUserBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button activityFormularioCadastroBotaoCadastrar;

  @NonNull
  public final TextInputEditText activityFormularioCadastroNome;

  @NonNull
  public final TextInputEditText activityFormularioCadastroSenha;

  @NonNull
  public final TextInputEditText activityFormularioCadastroUsuario;

  @NonNull
  public final TextInputLayout textInputLayoutUsuario;

  @NonNull
  public final TextInputLayout textInputlayoutNome;

  @NonNull
  public final TextInputLayout textInputlayoutSenha;

  private ActivityRegisterUserBinding(@NonNull ScrollView rootView,
      @NonNull Button activityFormularioCadastroBotaoCadastrar,
      @NonNull TextInputEditText activityFormularioCadastroNome,
      @NonNull TextInputEditText activityFormularioCadastroSenha,
      @NonNull TextInputEditText activityFormularioCadastroUsuario,
      @NonNull TextInputLayout textInputLayoutUsuario, @NonNull TextInputLayout textInputlayoutNome,
      @NonNull TextInputLayout textInputlayoutSenha) {
    this.rootView = rootView;
    this.activityFormularioCadastroBotaoCadastrar = activityFormularioCadastroBotaoCadastrar;
    this.activityFormularioCadastroNome = activityFormularioCadastroNome;
    this.activityFormularioCadastroSenha = activityFormularioCadastroSenha;
    this.activityFormularioCadastroUsuario = activityFormularioCadastroUsuario;
    this.textInputLayoutUsuario = textInputLayoutUsuario;
    this.textInputlayoutNome = textInputlayoutNome;
    this.textInputlayoutSenha = textInputlayoutSenha;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_formulario_cadastro_botao_cadastrar;
      Button activityFormularioCadastroBotaoCadastrar = ViewBindings.findChildViewById(rootView, id);
      if (activityFormularioCadastroBotaoCadastrar == null) {
        break missingId;
      }

      id = R.id.activity_formulario_cadastro_nome;
      TextInputEditText activityFormularioCadastroNome = ViewBindings.findChildViewById(rootView, id);
      if (activityFormularioCadastroNome == null) {
        break missingId;
      }

      id = R.id.activity_formulario_cadastro_senha;
      TextInputEditText activityFormularioCadastroSenha = ViewBindings.findChildViewById(rootView, id);
      if (activityFormularioCadastroSenha == null) {
        break missingId;
      }

      id = R.id.activity_formulario_cadastro_usuario;
      TextInputEditText activityFormularioCadastroUsuario = ViewBindings.findChildViewById(rootView, id);
      if (activityFormularioCadastroUsuario == null) {
        break missingId;
      }

      id = R.id.textInputLayout_usuario;
      TextInputLayout textInputLayoutUsuario = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutUsuario == null) {
        break missingId;
      }

      id = R.id.textInputlayout_nome;
      TextInputLayout textInputlayoutNome = ViewBindings.findChildViewById(rootView, id);
      if (textInputlayoutNome == null) {
        break missingId;
      }

      id = R.id.textInputlayout_senha;
      TextInputLayout textInputlayoutSenha = ViewBindings.findChildViewById(rootView, id);
      if (textInputlayoutSenha == null) {
        break missingId;
      }

      return new ActivityRegisterUserBinding((ScrollView) rootView,
          activityFormularioCadastroBotaoCadastrar, activityFormularioCadastroNome,
          activityFormularioCadastroSenha, activityFormularioCadastroUsuario,
          textInputLayoutUsuario, textInputlayoutNome, textInputlayoutSenha);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
