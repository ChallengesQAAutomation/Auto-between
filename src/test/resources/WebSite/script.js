document.addEventListener('DOMContentLoaded', function() {
  var emailInput = document.getElementById('email');
  var passwordInput = document.getElementById('password');
  var privacyCheckbox = document.getElementById('privacy');
  var privacyLabel = document.getElementById('privacyLabel');
  var submitButton = document.getElementById('submitBtn');

  emailInput.addEventListener('input', checkFormValidity);
  passwordInput.addEventListener('input', checkFormValidity);
  privacyCheckbox.addEventListener('change', checkFormValidity);

  function checkFormValidity() {
    var email = emailInput.value.trim();
    var password = passwordInput.value.trim();
    var privacyChecked = privacyCheckbox.checked;

    if (email !== '' && password !== '') {
      privacyLabel.classList.remove('hidden');
      if (privacyChecked) {
        submitButton.classList.add('enabled');
        submitButton.removeAttribute('disabled');
        privacyLabel.classList.add('hidden');
      } else {
        submitButton.classList.remove('enabled');
        submitButton.setAttribute('disabled', 'disabled');
        privacyLabel.classList.remove('hidden');
      }
    } else {
      submitButton.classList.remove('enabled');
      submitButton.setAttribute('disabled', 'disabled');
      privacyLabel.classList.add('hidden');
    }
  }

  var loginForm = document.getElementById('loginForm');
  loginForm.addEventListener('submit', function(event) {
    event.preventDefault();
    var successMessage = document.getElementById('successMessage');
    successMessage.classList.remove('hidden');
    console.log("hola")
    if (submitButton.classList.contains('enabled')) {
      // Aquí puedes agregar el código para enviar el formulario o realizar las validaciones necesarias.
  
      // Mostrar el mensaje de éxito
      var successMessage = document.getElementById('successMessage');
      successMessage.classList.remove('hidden');
    }
  });
});
