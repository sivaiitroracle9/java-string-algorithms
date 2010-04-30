/*
 * Copyright (c) 2010 Steve Reed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package algorithms.search;


class Help {

	static class LookupTable {
		long[] data = new long[1024];

		void set(char index) {
			data[index >> 6] |= (1L << index);
		}

		boolean get(char index) {
			return (data[index >> 6] & (1L << index)) != 0;
		}
	}

	static CharSequence reverse(final CharSequence string) {
		return new CharSequence() {
			@Override
			public int length() {
				return string.length();
			}

			@Override
			public char charAt(final int index) {
				return string.charAt(length() - index - 1);
			}

			@Override
			public CharSequence subSequence(final int start, final int end) {
				throw new UnsupportedOperationException();
			}
		};
	}
}
