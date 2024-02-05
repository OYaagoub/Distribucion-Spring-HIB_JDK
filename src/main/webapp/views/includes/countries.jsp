<%--
  Created by IntelliJ IDEA.
  User: oyaag
  Date: 05/02/2024
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--format code Control + Alt + L-->
<div class="control block-cube block-input" style="width: 24%">
    <label for="countries">Selecciona un país:</label>
    <select name="country" id="countries"  style="padding: 10px">

    </select>

</div>

<div class="control block-cube block-input" style="width: 24%">
    <label for="provinces">Selecciona una provincia:</label>
    <select id="provinces" name="province" style="padding: 10px"></select>

</div>
<script>
    const countriesSelect = document.getElementById('countries');
    const provincesSelect = document.getElementById('provinces');

    // Fetch the list of countries from the Universal Tutorial API
    fetch('${pageContext.request.contextPath}/static/json/countries.json', {
        method: 'GET',
        headers: {

            'Accept': 'application/json',
        },
    })
        .then(response => response.json())
        .then(data => {
            // Populate the country dropdown
            data.forEach(country => {
                const option = document.createElement('option');
                option.value = country.country_name;
                option.text = country.country_name;
                countriesSelect.appendChild(option);
            });

            // Trigger the change event to populate provinces for the default country
            countriesSelect.dispatchEvent(new Event('change'));
        })
        .catch(error => console.error('Error fetching countries:', error));

    // Event listener for country selection
    countriesSelect.addEventListener('change', () => {
        const selectedCountry = countriesSelect.value;

        // Fetch provinces for the selected country
        fetch(`https://www.universal-tutorial.com/api/states/`+selectedCountry, {
            method: 'GET',
            headers: {
                'Authorization': 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7InVzZXJfZW1haWwiOiJveWFhZ291YjRAZ21haWwuY29tIiwiYXBpX3Rva2VuIjoiNjZwbGF2bGZiTFgtR24yXzFwRjJwLWdjLWtsVEVsdFQxam1aOWJFa2FkOUVZcklSdnJkdkhkY1hhU29iYS1ycHcyOCJ9LCJleHAiOjE3MDcyMjgwODB9.GhOnmRqA58sLK4hR7dirtADpaeALGlebeYF-r-XrE9k', // Replace with your API key
                'Accept': 'application/json',
            },
        })
            .then(response => response.json())
            .then(data => {
                console.log(data)
                // Clear previous provinces
                provincesSelect.innerHTML = '';

                // Populate the dropdown with provinces
                data.forEach(province => {
                    const option = document.createElement('option');
                    option.value = province.state_name;
                    option.text = province.state_name;
                    provincesSelect.appendChild(option);
                });
            })
            .catch(error => console.error(`Error fetching provinces for ${selectedCountry}:`, error));
    });
</script>